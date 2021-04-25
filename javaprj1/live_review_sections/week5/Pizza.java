package week5;

public class Pizza {
	
	public String size;
	public int cheeseTopping;
	public int pepperoniTopping;
	
	public void customizeOrder(String pizzaSize, int cheese, int pepperoni) {
		
		size = pizzaSize;
		cheeseTopping = cheese;
		pepperoniTopping = pepperoni;
		
	}
	public double calculatePrice() {
		int startingPrice = (size.equals("small"))? 10 
				: (size.equals("medium")) ? 12 : 14;
		
		int totalPriceOfCheese =  1 * cheeseTopping;
		int totalPriceOfPepperoni = 2 * pepperoniTopping;
		
		return startingPrice + totalPriceOfCheese + totalPriceOfPepperoni;
	}
	@Override
	public String toString() {
		return "Pizza [size=" + size 
				+ ", cheeseTopping=" + cheeseTopping 
				+ ", pepperoniTopping=" + pepperoniTopping
				+ ", totalPrice=$" + calculatePrice() 
				+ "]";
	}
	
	

}
