package day30_20220428;

import java.util.*;

public class MemberMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		MemberService ms = new MemberService();
		
		
		while(run) {
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("1.회원가입  2.로그인  3.회원목록  4.상세조회  5.회원정보수정  6.회원삭제  7.객체비교예제  8.종료");
			System.out.println("--------------------------------------------------------------------------------");
			System.out.print("선택 >");
			int input = scan.nextInt();
			if (input == 1) {
				ms.save();
			}else if (input == 2) {
				ms.login();
			}else if (input == 3) {
				ms.findAll();
			}else if (input == 4) {
				ms.findById();
			}else if (input == 5) {
				ms.update();
			}else if (input == 6) {
				ms.delete();
			}else if (input == 7) {
				ms.temp();
			}
			else if (input == 8) {
				System.out.println("종료");
				run = false;
			}else {
				System.out.println("숫자를 다시 입력해주세요");
				
			}
		}
		
	}

}
