package day31_20220429_2;

import java.util.Scanner;

public class PostMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		PostService ps = new PostService();
		
		int input = 0;
		boolean run = true;
		
		while(run) {
			System.out.println("--------------------------------------------------------");
			System.out.println("1.글작성  2.글목록  3.글조회  4.글수정  5.글검색  6.글삭제  7.종료");
			System.out.println("--------------------------------------------------------");
			System.out.print("선택>");
			input = scan.nextInt();
			if(input == 1) {
				ps.save();
			}else if(input == 2) {
				ps.findAll();
			}else if(input == 3) {
				ps.findById();
			}else if(input == 4) {
				ps.update();
			}else if(input == 5) {
				ps.search();
			}else if(input == 6) {
				ps.delete();
			}else if(input == 7) {
				System.out.println("종료");
				run = false;
			}else {
				System.out.println("번호를 확인해주세요");
			}
		}

	}

}
