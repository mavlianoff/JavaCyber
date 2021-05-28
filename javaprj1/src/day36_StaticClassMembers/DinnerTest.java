package day36_StaticClassMembers;

public class DinnerTest {
	
	public static void main(String[] args) {
		
		Dinner mom = new Dinner();
		Dinner kid = new Dinner();
		Dinner dad = new Dinner();
		
		System.out.println("Total slice:" + Dinner.pizzaSlice);
		
		dad.takeASlice();
		kid.takeASlice();
		mom.takeASlice();
		
		System.out.println(Dinner.pizzaSlice);
		
		kid.takeASlice(3);
		dad.takeASlice(2);
//		mom.takeASlice();
		
		System.out.println(Dinner.pizzaSlice);
		
		System.out.println(Math.PI);
		
		
		
	}

}
