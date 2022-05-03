package day33_20220503t;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class BankRepository {

	static List<ClientDTO> clientList = new ArrayList<>();
	static List<BankingDTO> bankingList = new ArrayList<>();
	static Long bankingId = 0L;
	
	public boolean checkAccountNumber(String accountNumber) {
		boolean checkResult = false;
		for(int i=0; i<clientList.size(); i++) {
			if(accountNumber.equals(clientList.get(i).getAccountNumber())) {
				checkResult = true;
			}
		}
		return checkResult;
	}

	public boolean save(ClientDTO newClient) {
		return clientList.add(newClient);
	}

	public ClientDTO checkBalance(String accountNumber) {
		ClientDTO client = null;
		for(int i=0; i<clientList.size(); i++) {
			if(accountNumber.equals(clientList.get(i).getAccountNumber())) {
				client = clientList.get(i);
			}
		}
		return client;
	}

	public void deposit(String accountNumber, long money) {
		for(int i=0; i<clientList.size(); i++) {
			if(accountNumber.equals(clientList.get(i).getAccountNumber())) {
				clientList.get(i).setBalance(clientList.get(i).getBalance() + money);
				BankingDTO banking = new BankingDTO(++bankingId, accountNumber, money, 0, createdTime());
				bankingList.add(banking);
			}
		}
	}
	
	//현재시간 (자주 쓰는건 메서드를 따로 분리함)
	private String createdTime() {
		LocalDateTime dateTime = LocalDateTime.now();
		String createdTime = dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		return createdTime;
	}

	// 계좌번호 확인 
	public boolean checkAccountAndPass(String accountNumber, String clientPass) {
		boolean result = false;
		for(int i=0; i<clientList.size(); i++) {
			if(accountNumber.equals(clientList.get(i).getAccountNumber()) && 
					clientPass.equals(clientList.get(i).getClientPass())) {
				result = true;
			}
		}
		return result;
	}

	public boolean withdraw(String accountNumber, long money) {
		boolean result = false;
		for(int i=0; i<clientList.size(); i++) {
			if(accountNumber.equals(clientList.get(i).getAccountNumber())) {
				if(clientList.get(i).getBalance() >= money) {
					clientList.get(i).setBalance(clientList.get(i).getBalance() - money);
					BankingDTO banking = new BankingDTO(++bankingId, accountNumber, 0, money, createdTime());
					bankingList.add(banking);
					result = true;
				} else {
					result = false;
				}
			}
		}
		return result;
	}

	public List<BankingDTO> bankingList(String accountNumber) {
		List<BankingDTO> list = new ArrayList<BankingDTO>();
		for(int i=0; i<bankingList.size(); i++) {
			if(accountNumber.equals(bankingList.get(i).getAccountNumber())) {
				list.add(bankingList.get(i));
			}
		}
		return list;
	}
	
}
