package day30_20220428;

import java.util.*;

import day29_20220427_2.HumanDTO;

public class MemberService {

	MemberRepository mr = new MemberRepository();
	Scanner scan = new Scanner(System.in);
	Long id = 0L;
	
	// 1.회원가입
	void save() {
		MemberDTO member = new MemberDTO();
		member.setId(++id);
		System.out.print("아이디 : ");
		member.setMemberId(scan.next());
		scan.nextLine();
		System.out.print("비밀번호 : ");
		member.setMemberPassword(scan.nextLine());
		System.out.print("이름 : ");
		member.setMemberName(scan.nextLine());
		System.out.print("나이 : ");
		member.setMemberAge(scan.nextInt());
		scan.nextLine();
		System.out.print("전화번호 : ");
		member.setMemberMobile(scan.nextLine());
		boolean saveResult = mr.save(member);
		if(saveResult) {
			System.out.println("가입을 축하합니다^^");			
		} else {
			System.out.println("가입이 거절되었습니다.");
		}
	}
	
	// 2.로그인 
	
	void login() {
		System.out.print("아이디 : ");
		String memberId = scan.next();
		System.out.print("비밀번호 : ");
		String memberPassword = scan.next();
		MemberDTO member = mr.login(memberId,memberPassword);
		if(member == null) {
			System.out.println("아이디 또는 비밀번호가 틀립니다!!");
		} else {
			System.out.println("로그인 했습니다");
			//System.out.println(member);
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

	// 5. 회원정보 수정
	public void update() {
		System.out.print("아이디 : ");
		String memberId = scan.next();
		System.out.print("비밀번호 : ");
		String memberPassword = scan.next();
		MemberDTO member = mr.login(memberId,memberPassword);
		if (member != null) {
			System.out.print("수정할 전화번호 : ");
			member.setMemberMobile(scan.next());	
			member = mr.update(member);
			System.out.println(member);
		} else {
			System.out.println("정보를 확인하세요");
		}
	}
	
	//  6.회원삭제
	public void delete() {
		System.out.print("관리번호 : ");
		Long id = scan.nextLong();
		mr.delete(id);
		findAll();	
	}
	
	// 7. 객체 비교하기

	public void temp() {
		MemberDTO member1 = new MemberDTO(1L,"아이디1","비밀번호1","이름1",11,"111");
		MemberDTO member2 = new MemberDTO(1L,"아이디1","비밀번호1","이름1",11,"111");
		// 여기에만 실행하면 주소값이 다르기 때문에 동일하지 않다고 나옴
		// MemberDTO에 hashCode,equals(Object obj) 메서드 생성해야 동일하다고 나옴
		if(member1.equals(member2)) {
			System.out.println("두 객체가 동일합니다.");
		}else {
			System.out.println("두 객체가 동일하지 않습니다.");
		}
		
	}
	

}
