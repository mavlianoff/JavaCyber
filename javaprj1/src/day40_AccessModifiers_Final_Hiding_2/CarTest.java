package day40_AccessModifiers_Final_Hiding_2;

import day40_AccessModifiers_Final_Hiding.Car;

public class CarTest {
	
	public static void main(String[] args) {
		
		Car c = new Car();		// ERR: As we are in different package, we have to import it
		
//		c.model = "M3"; 		// ERR, default, outside package no access
		c.year = 2017;			// public. accessible anywhere
//		c.door = 4;				// private, accessible only inside same class, no access otherwise
//		c.engine = 5.3;			// protected, accessible outside only thru inheritance otherwise no access
		
		
		c.hashCode(); 		// coming from default Object class
							// remember to String @override for main class
							// super() for main class
							// all these are coming from default Object class
	}

}
