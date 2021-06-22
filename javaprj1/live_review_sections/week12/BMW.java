package week12;

public class BMW extends Car{

	public BMW(String make, String color, int year) {
		super("BMW", make, color, year);

	}

	@Override
	public void start() {
		System.out.println("Twist th key to ignition");
		
	}
	
	
	

}
