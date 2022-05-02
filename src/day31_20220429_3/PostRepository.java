package day31_20220429_3;

import java.util.*;

public class PostRepository {
	// 선생님 코드
	static List<PostDTO> postList = new ArrayList<>();

	/*
	 * 매개변수타입: 매개변수이름: 리턴: 메서드이름:
	 */
	public boolean save(PostDTO newPost) {
		return postList.add(newPost);
	}

	public List<PostDTO> findAll() {
		return postList;
	}

	public void updateHits(Long postId) {
		for (int i = 0; i < postList.size(); i++) {
			if (postId.equals(postList.get(i).getId())) {
				int hits = postList.get(i).getPostHits(); // 현재 조회수 값
				hits = hits + 1; // 현재 조회수에서 하나 증가
				postList.get(i).setPostHits(hits);
//				postList.get(i).setPostHits(postList.get(i).getPostHits() + 1);
			}
		}
	}

	public PostDTO findById(Long postId) {
		PostDTO post = null;
		for (int i = 0; i < postList.size(); i++) {
			if (postId.equals(postList.get(i).getId())) {
				post = postList.get(i);
			}
		}
		return post;
	}

	public Long postCheck(Long postId, String postPass) {
		Long checkId = null;
		for (int i = 0; i < postList.size(); i++) {
			if (postId.equals(postList.get(i).getId()) && 
					postPass.equals(postList.get(i).getPostPass())) {
				checkId = postList.get(i).getId();
			}
		}
		return checkId;
	}

	public PostDTO update(Long checkId, String postTitle, String postContents) {
		PostDTO updatePost = null;
		for (int i = 0; i < postList.size(); i++) {
			if (checkId.equals(postList.get(i).getId())) {
				postList.get(i).setPostTitle(postTitle);
				postList.get(i).setPostContents(postContents);
				updatePost = postList.get(i);
			}
		}
		return updatePost;
	}

	public List<PostDTO> search(String keyword) {
		// keyword: 사용자가 찾고 싶은 작성자 
		// postList에 저장된 작성자와 일치하는 것만 찾아서 searchList에 저장
		List<PostDTO> searchList = new ArrayList<>();
		for (int i = 0; i < postList.size(); i++) {
			if(keyword.equals(postList.get(i).getPostWriter())) {
				PostDTO searchPost = postList.get(i);
				searchList.add(searchPost);
				
//				searchList.add(postList.get(i));
			}
		}
		return searchList;
	}

	public void delete(Long checkId) {
		for (int i = 0; i < postList.size(); i++) {
			if (checkId.equals(postList.get(i).getId())) {
				postList.remove(i);
			}
		}
	}


}
