package day32_20220502;

public class ClientDTO {

	private Long id;
	private String clientName;
	private int clientPass;
	private String date;
	private int balance;
	private String accountNumber;
	
	ClientDTO(){
		
	}
	
	public ClientDTO(Long id, String clientName, int clientPass, String date, int balance, String accountNumber) {
		this.id = id;
		this.clientName = clientName;
		this.clientPass = clientPass;
		this.date = date;
		this.balance = balance;
		this.accountNumber = accountNumber;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public int getClientPass() {
		return clientPass;
	}

	public void setClientPass(int clientPass) {
		this.clientPass = clientPass;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "ClientDTO [id=" + id + ", clientName=" + clientName + ", clientPass=" + clientPass + ", date=" + date
				+ ", balance=" + balance + ", accountNumber=" + accountNumber + "]";
	}
	
	
	
	
}
