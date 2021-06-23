package day42_Interface;

public class Tesla extends ElectricCar{

	//CONTRUCTOR
	public Tesla(String model, double price, String color) {
		super(model, price, color);
		
	}

	
	//METHODS
	@Override
	public void start() {
		System.out.println("Tesla - change to driving mode...");
		
	}

	@Override
	public void charge() {
		System.out.println("Tesla charging - plugin to electric outlet...");
		
	}

	@Override
	public void driver() {
		System.out.println("Tesla is driving...");
		
	}
	
	
	
	
}
