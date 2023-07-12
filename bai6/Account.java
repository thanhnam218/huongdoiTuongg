package bai6;

public class Account {
	private long accountNumber;
	private String name;
	private double balance;
	private double Rate;

	public Account() {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	public Account(String name, long accountNumber, double balance) {
		// TODO Auto-generated constructor stub
		setAccountNumber(accountNumber);
		setName(name);
		setBalance(balance);
	}

	public long getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(long accountNumber) {
		if (accountNumber>0)
			this.accountNumber = accountNumber;
		else
			this.accountNumber = 0;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String toString() {
		return String.format("%d %s %f ", name, accountNumber, balance);
		}

}
