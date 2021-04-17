package day17_classObjects_2;

public class BankAccount {
	
	double balance;
	String accountHolder;
	int accountNumber;
	
	public void deposit(double amount) {
		System.out.println("Depositing $" + amount + " to " + accountNumber);
		balance+=amount;
	}
	
	public void withdraw(double amount) {
		System.out.println("Withdrawing $" + amount + " from " + accountNumber);
		balance-=amount;
		
		if(balance<0) {
			balance-=35;
		}
	}
	
	public void showBalance() {
		System.out.println("------------------------------");
		System.out.println("AccountHolder: " + accountHolder);
		System.out.println("AccountNumber: " + accountNumber);
		System.out.println("Balance: $ " + balance);
		System.out.println("------------------------------");
		
	}
	
	public void charge(double itemPrice, String item) {
		if(balance>=itemPrice) {
			System.out.println("Buying " + item + " for $ " + itemPrice + " from " + accountNumber);
			balance-=itemPrice;
		}else {
			System.out.println("Insufficient fund to purchase " + item + " from " + accountNumber);
		}
	}

}
