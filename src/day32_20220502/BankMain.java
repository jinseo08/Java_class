package day32_20220502;

import java.util.*;

public class BankMain {

	public static void main(String[] args) {
		
		/*1. 신규 고객 등록
		2. 잔액조회
		3. 입금
		4. 출금
		5. 거래내역확인
		6. 종료
		*/
		Scanner scan = new Scanner(System.in);
		int input = 0;
		boolean run = true;
		BankService bs = new BankService();
		
		while(run) {
			System.out.println("---------------------------------------------------------------");
			System.out.println("1. 신규 고객등록  2. 잔액조회  3. 입금  4. 출금  5. 거래내역확인  6. 종료");
			System.out.println("---------------------------------------------------------------");
			System.out.print("선택 > ");
			input = scan.nextInt();
			if(input == 1) {
				bs.save();
			}else if (input == 2) {
				bs.findAll();
			}else if (input == 3) {
				bs.dept();
			}else if (input == 4) {
				System.out.println("4");
			}else if (input == 5) {
				System.out.println("5");

			}else if (input == 6) {
				System.out.println("종료");
				run = false;
			}else {
				System.out.println("숫자를 확인해주세요");
			}
		}
		
		
		

	}

}
