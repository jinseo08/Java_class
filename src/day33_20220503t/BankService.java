package day33_20220503t;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class BankService {

	Scanner scan = new Scanner(System.in);
	static Long id = 0L;
	BankRepository br = new BankRepository();
	
	public void save() {
		System.out.print("이름: ");
		String clientName = scan.next();
		System.out.print("비밀번호: ");
		String clientPass = scan.next();
		System.out.print("계좌번호: ");
		String accountNumber = scan.next();
		LocalDateTime dateTime = LocalDateTime.now();
		String clientCreatedDate = dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		
		if(!checkAccountNumber(accountNumber)) {
			ClientDTO newClient = new ClientDTO(++id, clientName, clientPass, clientCreatedDate, 0, accountNumber);
			boolean saveResult = br.save(newClient);
			if(saveResult) {
				System.out.println("신규 고객 등록 완료");
			} else {
				System.out.println("고객 등록 실패");
			}
		} else {
			System.out.println("중복된 계좌입니다. 처음부터 다시 진행해주세요");			
		}
	}

	public void checkBalance() {
		System.out.print("계좌번호: ");
		String accountNumber = scan.next();
		if(checkAccountNumber(accountNumber)) {
			ClientDTO client = br.checkBalance(accountNumber);
			System.out.println(client.getAccountNumber() + "계좌의 잔액은 " + client.getBalance() + "원 입니다.");
		} else {
			System.out.println("일치하는 계좌가 없습니다.");
		}
	}

	public void deposit() {
		System.out.print("계좌번호: ");
		String accountNumber = scan.next();
		System.out.print("입금액: ");
		long money = scan.nextLong();
		if(checkAccountNumber(accountNumber)) {
			br.deposit(accountNumber, money);
		} else {
			System.out.println("일치하는 계좌가 없습니다.");
		}
	}

	public void withdraw() {
		System.out.print("계좌번호: ");
		String accountNumber = scan.next();
		System.out.print("비밀번호: ");
		String clientPass = scan.next();
		System.out.print("출금액: ");
		long money = scan.nextLong();
		if(br.checkAccountAndPass(accountNumber, clientPass)) {
			if(br.withdraw(accountNumber, money)) {
				System.out.println("출금처리 완료");
			} else {
				System.out.println("잔액이 부족합니다.");
			}
		} else {
			System.out.println("입력하신 정보가 틀립니다.");
		}
	}

	public void bankingList() {
		boolean run = true;
		System.out.print("계좌번호: ");
		String accountNumber = scan.next();
		int selectNumber = 0;
		List<BankingDTO> bankingList = br.bankingList(accountNumber);
		while (run && checkAccountNumber(accountNumber)) {
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("1.모든 내역 | 2.입금 내역 | 3.출금 내역 | 4.종료 ");
			System.out.println("-----------------------------------------------------------------------");
			System.out.print("선택> ");
			selectNumber = scan.nextInt();
			if (selectNumber == 1) {
				for(BankingDTO b: bankingList) {
					System.out.println(b);
				}
			} else if (selectNumber == 2) {
				for(BankingDTO b: bankingList) {
					if(b.getDeposit() > 0) {
						System.out.println(b.getAccountNumber() + "  " + b.getDeposit() + "  " + b.getBankingDate());
					}
				}
			} else if (selectNumber == 3) {
				for(BankingDTO b: bankingList) {
					if(b.getWithdraw() > 0) {
						System.out.println(b.getAccountNumber() + "  " + b.getWithdraw() + "  " + b.getBankingDate());
					}
				}
			} else if (selectNumber == 4) {
				run = false;
			}
		}
	}
	
	//if문 안에 사용하기 때문에 boolean 타입
	private boolean checkAccountNumber(String accountNumber) {
		return br.checkAccountNumber(accountNumber);
		
	}
	
}
