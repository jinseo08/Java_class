package day32_20220502;

import java.util.*;

public class BankRepository {

	static List<BankingDTO> bankingList = new ArrayList<>();
	static List<ClientDTO> clientList = new ArrayList<>();
	
	// 1.신규고객등록
	public ClientDTO save(ClientDTO client) {
		clientList.add(client);
		return client;
	}
	
	// 계좌번호 중복체크
	public ClientDTO acctNumCheck(String accountNumber) {
		ClientDTO client = null;
		for(int i = 0; i < clientList.size(); i++) {
			if(accountNumber.equals(clientList.get(i).getAccountNumber())) {
				client = clientList.get(i);
			}
		}
		return client;
	}


	//2. 잔액조회
	public BankingDTO findAll(String accountNumber) {
		BankingDTO bank = null;
		for(int i = 0; i < bankingList.size(); i++) {
			if(accountNumber.equals(bankingList.get(i).getAccountNumber())) {
				bank = bankingList.get(i);
			}
		}
		return bank;
	}

	
	//3. 입금
	public BankingDTO dept(String accountNumber, int deposit) {
		BankingDTO bank = null; 
		for(int i = 0; i < bankingList.size(); i++) {
			if(accountNumber.equals(bankingList.get(i).getAccountNumber())) {
				bank = bankingList.get(i);
				bank.setDeposit(bank.getDeposit() + deposit); 			
			}
		}
		return bank;
	}
	
	
	
	
	
	
	
}
