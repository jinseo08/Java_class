package day33_20220503t;

public class ClientDTO {

	
	private Long id;
	private String clientName;
	private String clientPass;
	private String clientCreatedDate;
	private long balance;
	private String accountNumber;

	public ClientDTO() {

	}

	public ClientDTO(Long id, String clientName, String clientPass, String clientCreatedDate, long balance,
			String accountNumber) {
		this.id = id;
		this.clientName = clientName;
		this.clientPass = clientPass;
		this.clientCreatedDate = clientCreatedDate;
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

	public String getClientPass() {
		return clientPass;
	}

	public void setClientPass(String clientPass) {
		this.clientPass = clientPass;
	}

	public String getClientCreatedDate() {
		return clientCreatedDate;
	}

	public void setClientCreatedDate(String clientCreatedDate) {
		this.clientCreatedDate = clientCreatedDate;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
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
		return "ClientDTO [id=" + id + ", clientName=" + clientName + ", clientPass=" + clientPass
				+ ", clientCreatedDate=" + clientCreatedDate + ", balance=" + balance + ", accountNumber="
				+ accountNumber + "]";
	}
}
