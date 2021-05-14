package day33_ClassObjects_Constructors;

public class BankAccount {

	//instance variable
	double balance;
	
	//This custom constructor sets the starting balance to 0.0
	public BankAccount() {
		balance = 0.0;
	}
	
	//This custom constructor sets the starting balance to the value passes as an argument
	public BankAccount( double startBalance) {
		balance = startBalance;
	}
	
	//This custom constructor sets the starting balance to the value in the string argument
	public BankAccount(String str) {
		balance = Double.parseDouble(str);
	}
	
	
	// Deposit method makes a deposit into account
	public void deposit(String str) {
		balance = balance + Double.parseDouble(str);
	}
	
	public double getBalance() {
		return balance;
	}
	
	
	
}
