package day31_20220429_2;

import java.util.*;

public class PostRepository {
	
	static List<PostDTO> postList = new ArrayList<>();
	static int postHits;

	//1.글작성
	public void save(PostDTO post) {
		postList.add(post);
	}

	//2.글목록
	public List<PostDTO> findAll() {
		return postList;
	}

	
	//3.글조회
	public PostDTO findById(Long id) {
		PostDTO post = null;
		for (int i = 0; i < postList.size(); i++) {
			if(id.equals(postList.get(i).getId())){
				post = postList.get(i);
				post.setPostHits(post.getPostHits()+1);
			}
	}
		return post;
	}


	// 4. 글수정
	public PostDTO update(Long id, String postpass) {
		PostDTO post = null;
		for(int i = 0; i < postList.size(); i++) {
			if(id.equals(postList.get(i).getId()) && postpass.equals(postList.get(i).getPostPass())) {
				post = postList.get(i);
			}
		}
		return post;
	}


	// 5. 글검색
	
	public PostDTO[] search(String postWriter) {
		PostDTO[] post = new PostDTO[postList.size()];
		for(int i = 0; i < postList.size(); i++) {
			if(postWriter.equals(postList.get(i).getPostWriter())){
				post[i] = postList.get(i);	
			}
		}
		return post;
	}

	
	// 6. 글삭제
	public PostDTO delete(Long id) {
		PostDTO post = null;
		for(int i = 0; i < postList.size(); i++) {
			if(id.equals(postList.get(i).getId())) {
				post = postList.remove(i);
			}
		}
		return post;
	}
	
	
	
	
	
	
	
	
	
}
