package day42_Interface;

public class Ford extends ElectricCar{
		
	private int year;

	//CONSTRUCTOR
	public Ford(String model, double price, String color, int year) {
		super(model, price, color);
		this.year = year;

	}

	
	//METHODS
	@Override
	public void start() {
		System.out.println("Ford - Push start button to start...");
		
	}

	@Override
	public void charge() {
		System.out.println("Ford - plugin to electric outlet...");
		
	}

	@Override
	public void driver() {
		System.out.println("Ford is driving...");
		
	}


	//GETTERS AND SETTER
	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	
	
	
	

}
