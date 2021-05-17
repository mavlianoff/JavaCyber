package week8;

public class ItemWalmart {

	public static void main(String[] args) {
		
		Item item1 = new Item("Toobox", 122, 12.99);
		System.out.println(item1);
		System.out.println("Item total cost is: $" + item1.calCost());
		
		Item[] items = {
				new Item("Toilet paper", 100, 2),
				new Item("Cucumber", 3, 1.59),
				new Item("Toolbox", 7, 1.99),
				new Item("WoodenPalets", 5, 3.99),
				new Item("Toilet bags", 3, 12.99),
				new Item("Toy paper", 101, 200.99),
		};
		
		double totalPriceBeforeTax = 0;
		int largestQuantity = 0;
		String nameOfItem = "";
		
		for(Item item: items) {
			totalPriceBeforeTax+=item.calCost();
			if(item.quantity > largestQuantity) {
				largestQuantity = item.quantity;
				nameOfItem = item.name;
			}
		}
		System.out.println("Total Price of items before tax is: $" + totalPriceBeforeTax);
		System.out.println("Largest quantity item is: " + nameOfItem);
		
		
		
		
	}
	
	
	
	
	
}
