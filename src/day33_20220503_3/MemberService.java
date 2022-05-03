package day33_20220503_3;

import java.util.*;

public class MemberService {

	MemberRepository mr = new MemberRepository();
	Scanner scan = new Scanner(System.in);
	Long id = 0L;
	
	// 1.회원가입
	void save() {
		
		System.out.print("아이디 : ");
		String memberId = scan.next();
		scan.nextLine();
		System.out.print("비밀번호 : ");
		String memberPassword = scan.next();
		System.out.print("이름 : ");
		String memberName = scan.next();
		System.out.print("나이 : ");
		int memberAge = scan.nextInt();
		System.out.print("전화번호 : ");
		String memberMobile = scan.next();
		MemberDTO member = new MemberDTO(++id,memberId,memberPassword,memberName,memberAge,memberMobile);
		mr.save(member);
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
			}
		}
		
		
		// 3.회원목록
		public void findAll() {
			Map<Long, MemberDTO> memberMap = mr.findAll();
			for(Long m : memberMap.keySet()) {
				System.out.println(memberMap.get(m));
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
		

		
}
