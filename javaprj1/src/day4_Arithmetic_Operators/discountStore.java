package day4_Arithmetic_Operators;

public class discountStore {

	public static void main(String[] args) {
		// This program calculates the sale price of an
		//item that us regularly priced at $59, with 20% discount on it
		
		int regPrice=59;
		double discount;
		double salesPrice;
		
		discount=regPrice*0.2;
		salesPrice=regPrice-discount;
		
		System.out.println("Regular Price: $"+regPrice);
		System.out.println("Discount Amount: $"+discount);
		System.out.println("Sales Price: $"+salesPrice);

	}

}
