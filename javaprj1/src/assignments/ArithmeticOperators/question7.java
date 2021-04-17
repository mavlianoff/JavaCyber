package assignments.ArithmeticOperators;

public class question7 {

	public static void main(String[] args) {
		/*
		
		Write a program that determines the change to be dispensed from a vending machine. An item in the machine can cost between 25 cents and 1 dollar, in 5-cent increments (25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single dollar bill to pay for the item.

	      Sample output
	
	      Price in cents : 95
	
	      Your change is 0 quarters, 0 dimes, and 1 nickles
		
		 */
		
		int price = 35;		
		int change = (100 - price);		// 95
		
		
		int quarters=change/25;
		int quarterRemainder=change%25;
		int dimes=quarterRemainder/10;
		int dimeRemainder=quarterRemainder%10;
		int nickels= dimeRemainder/5;

	}

}
