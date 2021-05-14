package day33_ClassObjects_Constructors;

public class CarTest {
	
	public static void main(String[] args) {
		
		Car c1 = new Car(); //Q1 - 'new'  - call constructor. //Q2 - which constructor?
		System.out.println(c1.make); // "Civic" - because of non-parameter constructor initialization
		
		Car c2 = new Car("Ford", "Focus", 2010, 123000, "silver");
		System.out.println(c2.make);
		
		Car c3 = new Car("BMW", "320", 2020, 23000, "Dark Blue");
		System.out.println(c3.make);
		
		Car c4 = new Car("Suzuki", "Swift", 2008, 234876, "red");
		System.out.println(c4.make);
		
	}

}
