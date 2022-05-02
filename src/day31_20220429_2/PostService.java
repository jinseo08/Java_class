package day31_20220429_2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class PostService {

	
	PostRepository pr = new PostRepository();
	Scanner scan = new Scanner(System.in);
	Long id = 0L;

	
	// 1. 글작성
	public void save() {
		PostDTO post = new PostDTO();
		System.out.print("제목 : ");
		post.setPostTitle(scan.nextLine());
		System.out.print("작성자 : ");
		post.setPostWriter((scan.nextLine()));
		System.out.print("비밀번호 : ");
		post.setPostPass((scan.nextLine()));
		System.out.print("내용 : ");
		post.setPostContents((scan.nextLine()));
		LocalDateTime date = LocalDateTime.now();
		String time = date.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH:mm:ss"));
		post.setDate(time);
		pr.save(post);
		post.setId(++id);
		System.out.println("글등록 완료");
	}

	// 2. 글목록
	public void findAll() {
		List<PostDTO> postList = pr.findAll();
		for(PostDTO p : postList) {
			System.out.println(p);
		}
	}

	// 3. 글조회
	public void findById() {
		System.out.print("글번호 : ");
		Long id = scan.nextLong();
		PostDTO post = pr.findById(id);
		if(post != null) {
			System.out.println(post);
		}else {
			System.out.println("조회결과가 없습니다!!");
		}

	}


	//4. 글수정
	public void update() {
		System.out.print("글번호 : ");
		Long id = scan.nextLong();
		scan.nextLine();
		System.out.print("비밀번호 : ");
		String postpass = scan.nextLine();
		PostDTO post = pr.update(id,postpass);
		if(post != null) {
			System.out.print("수정 할 제목 : ");
			post.setPostTitle(scan.nextLine());
			System.out.print("수정 할 내용 : ");
			post.setPostContents(scan.nextLine());
			System.out.println(post);
		}
		else {
			System.out.println("정보를 확인해주세요");
		}
	}

	// 5. 글검색
	public void search() {
		System.out.print("작성자 : ");
		String postWriter = scan.nextLine();
		PostDTO[] post = pr.search(postWriter); 
		if(post != null) {
			for(int i = 0; i < post.length; i++) {
				System.out.println(post[i]);
			}
		}else {
			System.out.println("조회결과가 없습니다!");
		}
		
	}
	
	

	// 6. 글삭제
	//삭제할 글의 글번호를 입력 받고 해당 글 정보를 삭제하고, 글목록을 출력하여 삭제가 됐는지 확인할 수 있다.
	public void delete() {
		System.out.print("글번호 : ");
		Long id = scan.nextLong(); 
		PostDTO post = pr.delete(id);
		if(post == null) {
			System.out.println("정보를 확인하세요");
		}else {
			findAll();			
		}
		
	}


}
