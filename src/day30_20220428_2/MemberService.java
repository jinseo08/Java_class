package day30_20220428_2;

import java.util.*;

public class MemberService {

	
	//선생님 코드
	
	Scanner scan = new Scanner(System.in);
	static Long id = 0L;
	MemberRepository mr = new MemberRepository();
	
	public void save() {
		System.out.print("아이디: ");
		String memberId = scan.nextLine();
		System.out.print("비밀번호: ");
		String memberPassword = scan.nextLine();
		System.out.print("이름: ");
		String memberName = scan.nextLine();
		System.out.print("나이: ");
		int memberAge = scan.nextInt();
		scan.nextLine();
		System.out.print("전화번호: ");
		String memberMobile = scan.nextLine();
		
		MemberDTO newMember = 
				new MemberDTO(++id, memberId, memberPassword, memberName, memberAge, memberMobile);
		boolean saveResult = mr.save(newMember);
		if(saveResult) {
			System.out.println("가입을 축하합니다^^");
		} else {
			System.out.println("가입이 거절되었습니다.");
		}
//		System.out.println(newMember);
	}

	public void login() {
		System.out.print("아이디: ");
		String memberId = scan.nextLine();
		System.out.print("비밀번호: ");
		String memberPassword = scan.nextLine();
		boolean loginResult = mr.login(memberId, memberPassword);
		if(loginResult) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("아이디 또는 비밀번호가 틀립니다!!");
		}
	}

	public void findAll() {
		List<MemberDTO> memberList = mr.findAll();
		for(MemberDTO m: memberList) {
			System.out.println(m);
		}
	}

	public void findById() {
		findAll();
		System.out.print("조회할 번호입력: ");
		Long findId = scan.nextLong();
		MemberDTO member = mr.findById(findId);
		if(member == null) {
			System.out.println("조회결과가 없습니다!!");
		} else {
			System.out.println(member);
		}
	}

	public void update() {
		System.out.print("아이디: ");
		String memberId = scan.nextLine();
		System.out.print("비밀번호: ");
		String memberPassword = scan.nextLine();
		Long loginId = mr.loginCheck(memberId, memberPassword);
		// 로그인 체크가 되면 그 다음.. 
		// loginId: 로그인을 시도한 회원의 관리번호(id)
		if(loginId != null) {
			System.out.print("변경할 전화번호: ");
			String updateMobile = scan.nextLine();
			MemberDTO updateMember = mr.update(loginId, updateMobile);
			System.out.println("수정 후 회원정보: " + updateMember);
		} else {
			System.out.println("아이디 또는 비밀번호가 틀립니다!!");
		}
	}

	public void delete() {
		findAll();
		System.out.print("삭제할 번호입력: ");
		Long deleteId = scan.nextLong();
		mr.delete(deleteId);
		findAll();
	}

	public void temp() {
		// 객체 비교하기 
		MemberDTO member1 = new MemberDTO(1L, "id1", "pw1", "name1", 11, "111");
		MemberDTO member2 = new MemberDTO(1L, "id1", "pw1", "name1", 11, "111");
		if(member1.equals(member2)) {
			System.out.println("두 객체가 동일합니다.");
		} else {
			System.out.println("두 객체가 동일하지 않습니다.");
		}
		
	}
}
