package day25_Arrays_part2;

public class ForEachLoop {

	public static void main(String[] args) {
		
		String[] products = {"Zara", "Mara", "Adidas", "Madidas"};
		double[] prices = {12.99, 2.99, 112.99, 11.99};
		
		for(int i=0; i<products.length; i++) {
			System.out.print(products[i] + " ");
		}
		
		for(int i=0; i<prices.length; i++) {
			System.out.print("$" + prices[i] + " ");
//			System.out.print(products[i] + ": $" + prices[i] + " \n");
		}
		
		System.out.println("\n+++++++++++++++");
		
		for(String prod: products) {
			System.out.print(prod + ": ");
		}
		
		for(double price: prices) {
			System.out.print("$" + price + " ");
		}

		System.out.println("\n+++++++++++++++");
		
		//print products in reverse order
		for(int i=products.length -1; i>=0; i--) {
			System.out.println(products[i]);
		}

	}

}
