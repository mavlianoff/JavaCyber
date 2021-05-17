package week8;

public class Item {

	public String name;
	public int quantity;
	public double unitPrice;
	
	public Item(String name, int quantity, double unitPrice) {
		this.name = name;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}
	
	public String toString() {
		return "Item [name=" + name + ", quantity=" + quantity + ", unitPrice=" + unitPrice + "]";
	}
	
	public double calCost() {
		return quantity*unitPrice;
	}
	
	
	
	
}
