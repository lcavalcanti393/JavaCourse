package entities;

public class Bank {
	private int account;
	private String name;
	private double balance;
	private final double TAX = 5.00;
	
	public Bank(int account, String name) {
		this.account 	= account;
		this.name 		= name;
	}	
	public Bank(int account, String name, double initialDeposit) {
		this.account 	= account;
		this.name 		= name;
		deposit(initialDeposit);
	}
	
	public int getAccount() {
		return account;
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

	public void deposit(double deposit) {
		this.balance += deposit;
	}
	
	public void withdraw(double quantity) {
		this.balance -= quantity + TAX;
	}

	public String toString() {
		return("Account: " + account + ", Holder: " + name + ", Balance: $ "+ String.format("%.2f", balance));
	}

}
