package day30_20220428;

import java.util.*;

import day29_20220427_2.HumanDTO;

public class MemberService {


	MemberRepository mr = new MemberRepository();
	Scanner scan = new Scanner(System.in);
	
	
	// 1.회원가입
	void save() {
		//Long id = 1L;
		System.out.print("아이디 : ");
		String memberId = scan.next();
		scan.nextLine();
		System.out.print("비밀번호 : ");
		String memberPassword = scan.nextLine();
		System.out.print("이름 : ");
		String memberName = scan.nextLine();
		System.out.print("나이 : ");
		int memberAge = scan.nextInt();
		scan.nextLine();
		System.out.print("전화번호 : ");
		String memberMobile = scan.nextLine();
		mr.save(memberId, memberPassword, memberName, memberAge, memberMobile);
		System.out.println("가입을 축하합니다^^");
	}
	
	// 2.로그인
	void login() {
		System.out.print("아이디 : ");
		String memberId = scan.next();
		System.out.print("비밀번호 : ");
		String memberPassword = scan.next();
		MemberDTO login = mr.login(memberId,memberPassword);
		if(login == null) {
			System.out.println("아이디 또는 비밀번호가 틀립니다!!");
		} else {
			System.out.println("로그인 했습니다");
			System.out.println(login);
		}
		
		
	}
	
	// 3.회원목록
	public void findAll() {
		List<MemberDTO> MemberList = mr.findAll();
		for(MemberDTO m : MemberList) {
			System.out.println(m);
		}
		
	}

	
	// 4. 상세조회
	public void findById() {
		System.out.print("관리번호 : ");
		Long id = scan.nextLong();
		MemberDTO member = mr.findById(id);
		if(member == null) {
			System.out.println("조회결과가 없습니다!");
		}  else {
			System.out.println("관리번호" + id + "인 회원정보");
			System.out.println(member);
		}
		
	}
	
	

	
	


}
