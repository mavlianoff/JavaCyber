package week5;

public class PizzaObjects {
	
	public static void main(String[] args) {
		
		Pizza pizza1 = new Pizza();
		Pizza pizza2 = new Pizza();
		Pizza pizza3 = new Pizza();
		
		pizza1.customizeOrder("large", 2, 3);
		System.out.println(pizza1);
		
		pizza2.customizeOrder("small", 2, 1);
		System.out.println(pizza2);
		
		pizza3.customizeOrder("medium", 3, 2);
		System.out.println(pizza3);
		
		System.out.println("==============================");
		//Order 159 pizza: medium, 2, 3;
		
		double totalPrice=0;
		
		for(int i = 1; i <= 159; i++) {
			Pizza pizzaOrder= new Pizza();
			pizzaOrder.customizeOrder("medium", 2, 3);
//			System.out.println(pizzaOrder);
			totalPrice += pizzaOrder.calculatePrice();
		}
		
		System.out.println(totalPrice);
	}

}
