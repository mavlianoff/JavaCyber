package day40_AccessModifiers_Final_Hiding;

public class CarTest {
	
	public static void main(String[] args) {
		
		Car c = new Car();
		c.model = "M3"; 		// default, accessible in the same package
		c.year = 2017;			// public. accessible anywhere
//		c.door = 4;				// private, accessible only inside same class, no access otherwise
		c.engine = 5.3;			// protected, accessible in the same package
		
		
		
	}

}
