package programowanieobiektowe.banking;

public class Account {

	private double balance;
	
	public Account(double balance) {
		this.balance = balance; 
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double atm) {
		this.balance += atm;
	}
	public void withdraw(double atm) {
		this.balance -= atm;
	}
}
