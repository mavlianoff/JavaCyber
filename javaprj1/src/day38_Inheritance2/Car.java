package day38_Inheritance2;

public class Car extends Vehicle {
	
	int maxSpeed = 180;
	
	public void display() {
		System.out.println("Max speed: " + super.maxSpeed); 	// in case you want to see parent class max speed
		System.out.println("Max speed: " + maxSpeed);	
//		System.out.println("Max speed: " + super.maxSpeed); 	// can be here too as it is not a constructor
	}
	
}
