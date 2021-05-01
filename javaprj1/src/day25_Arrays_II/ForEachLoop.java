package day25_Arrays_II;

public class ForEachLoop {

	public static void main(String[] args) {
		
		String[] products = {"Zara", "Mara", "Adidas", "Madidas"};
		double[] prices = {12.99, 2.99, 112.99, 11.99};
		
		for(int i=0; i<products.length; i++) {
			System.out.println(products[i]);
		}
		
		for(int i=0; i<prices.length; i++) {
			System.out.println(prices[i]);
		}
		
		System.out.println("+++++++++++++++");
		
		for(String prod: products) {
			System.out.println(prod);
		}
		
		for(double price: prices) {
			System.out.println(price);
		}

	}

}
