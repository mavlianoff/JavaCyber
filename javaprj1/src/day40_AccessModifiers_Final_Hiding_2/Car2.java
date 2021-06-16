package day40_AccessModifiers_Final_Hiding_2;

import day40_AccessModifiers_Final_Hiding.Car;

public class Car2 extends Car {
	
	public Car2() {

	//	model = "M3"; 			// ERR, default, outside, subclass - no access
		year = 2017;			// public. accessible anywhere
//		door = 4;				// ERR, private, accessible only inside same class, no access otherwise
		engine = 5.3;			// ERR, protected, accessible outside only thru subclass(inheritance) otherwise no access
	
	}
	
}
