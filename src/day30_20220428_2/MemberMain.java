package day30_20220428_2;

import java.util.*;

public class MemberMain {

	public static void main(String[] args) {
		//선생님 코드
	
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int selectNumber = 0;
		MemberService ms = new MemberService();
		while (run) {
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("1.회원가입 | 2.로그인 | 3.회원목록 | 4.상세조회 | 5.회원정보수정 | 6.회원삭제 | 7.종료");
			System.out.println("-----------------------------------------------------------------------");
			System.out.print("선택> ");
			selectNumber = scan.nextInt();
			if (selectNumber == 1) {
				ms.save();
//				MemberService.save();
			} else if (selectNumber == 2) {
				ms.login();
			} else if (selectNumber == 3) {
				ms.findAll();
			} else if (selectNumber == 4) {
				ms.findById();
			} else if (selectNumber == 5) {
				ms.update();
			} else if (selectNumber == 6) {
				ms.delete();
			} else if (selectNumber == 7) {
				ms.temp();
			}
		}
	}

}
