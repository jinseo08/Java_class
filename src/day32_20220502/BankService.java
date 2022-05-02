package day32_20220502;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class BankService {

	BankRepository br = new BankRepository();
	Scanner scan = new Scanner(System.in);
	Long id = 0L;
	

	// 1. 신규등록
	public void save() {
		System.out.print("고객이름 : ");
		String clientName = scan.next();
		System.out.print("비밀번호 : ");
		int clientPass = scan.nextInt();
		System.out.print("계좌번호 : ");
		String accountNumber = scan.next();
		LocalDateTime time = LocalDateTime.now();
		String date = time.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		int balance = 0;
		ClientDTO acctNumCheck = br.acctNumCheck(accountNumber);
		if(acctNumCheck != null) {
			System.out.println("중복된 계좌번호 입니다.");
		}else {
			ClientDTO client = new ClientDTO(++id,clientName,clientPass,date, balance, accountNumber); 
			client = br.save(client);
			System.out.println("신규 고객 등록 완료!");
			System.out.println(client);
		}
	}

	
	// 2. 잔액조회
    // 잔액조회는 계좌번호 입력하면 "000-000 계좌의 잔액은 0000원 입니다." 출력. 
	// 일치하는 계좌가 없으면 "일치하는 계좌가 없습니다." 출력.
	public void findAll() {
		ClientDTO client = new ClientDTO();
		System.out.print("계좌번호 : ");
		String accountNumber = scan.next();
		ClientDTO acctNumCheck  = br.acctNumCheck(accountNumber);
		if(acctNumCheck != null) {
			br.findAll(accountNumber);
			System.out.println(accountNumber + "계좌의 잔액은 " + client.getBalance() + "원 입니다.");
		}else {
			System.out.println("일치하는 계좌가 없습니다.");
		}
	}

	// 3.입금
	// 입금할 계좌번호, 입금할 금액을 입력받는다. 계좌번호가 존재하지 않는다면 
	// “해당 계좌와 일치하는 계좌가 없습니다.” 출력하고 입금처리를 하지 않는다.
	// 일치하는 계좌가 있다면 해당 계좌의 잔액을 입금한 금액만큼 증가시키고, 해당 거래내역 또한 거래내역 목록에도 추가한다.
	public void dept() {
		System.out.print("입금할 계좌번호 : ");
		String accountNumber = scan.next();
		System.out.print("입금할 금액 : ");
		int deposit = scan.nextInt();
		ClientDTO NumCheck  = br.acctNumCheck(accountNumber);
		if(NumCheck != null) {
			BankingDTO bank = br.dept(accountNumber,deposit);
		}else {
			System.out.println("일치하는 계좌가 없습니다.");
		}
	}
	


	
	

	
	
	
	
	
	
	
	
	

}
