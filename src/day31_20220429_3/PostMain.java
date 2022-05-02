package day31_20220429_3;

import java.util.*;

public class PostMain {

	public static void main(String[] args) {
		// 선생님 코드

		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int selectNumber = 0;
		PostService ps = new PostService();
		while (run) {
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("1.글작성 | 2.글목록 | 3.글조회 | 4.글수정 | 5.글검색 | 6.글삭제 | 7.종료");
			System.out.println("-----------------------------------------------------------------------");
			System.out.print("선택> ");
			selectNumber = scan.nextInt();
			if (selectNumber == 1) {
				ps.save();
			} else if (selectNumber == 2) {
				ps.findAll();
			} else if (selectNumber == 3) {
				ps.findById();
			} else if (selectNumber == 4) {
				ps.update();
			} else if (selectNumber == 5) {
				ps.search();
			} else if (selectNumber == 6) {
				ps.delete();
			} else if (selectNumber == 7) {
				
			}
		}
	}
	

}
