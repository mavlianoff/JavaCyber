package week12;

public class Toyota extends Car {

	public Toyota(String make, String color, int year) {
		super("Toyota", make, color, year);
		
	}

	@Override
	public void start() {
		System.out.println("Twist the key");
		
	}
	
	
	
	
}
