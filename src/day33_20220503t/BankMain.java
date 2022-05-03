package day33_20220503t;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int selectNumber = 0;
		BankService bs = new BankService();
		while (run) {
			System.out.println("-----------------------------------------------------------------");
			System.out.println("1.신규 고객 등록 | 2.잔액조회 | 3.입금 | 4.출금 | 5.거래내역확인 | 6.종료 ");
			System.out.println("----------------------------------------------------------------");
			System.out.print("선택> ");
			selectNumber = scan.nextInt();
			if (selectNumber == 1) {
				bs.save();				
			} else if (selectNumber == 2) {
				bs.checkBalance();
			} else if (selectNumber == 3) {
				bs.deposit();
			} else if (selectNumber == 4) {
				bs.withdraw();
			} else if (selectNumber == 5) {
				bs.bankingList();
			} else if (selectNumber == 6) {
				run = false;
			} else{
				System.out.println("번호를 확인해주세요");
			}
		}
	}

}
