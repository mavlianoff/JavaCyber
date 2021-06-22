package week12;

public class Tesla extends Car{

	public Tesla(String make, String color, int year) {
		super("Tesla", make, color, year);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start() {
		System.out.println("Say start");
		
	}
	
	public void autoPilot() {
		System.out.println("Tesla is self driving");
	}
	
	
	

}
