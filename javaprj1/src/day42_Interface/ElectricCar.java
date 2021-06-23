package day42_Interface;

public abstract class ElectricCar {
	
	private String model;
	private double price;
	private String color;
	
	//CONSTRUCTORS
	
	public ElectricCar(String model, double price, String color) {

		this.model = model;
		this.price = price;
		this.color = color;
	}
	
	//METHODS
	
	public abstract void start();	// WHAT to do instead of HOW to do
	public abstract void charge();
	public abstract void driver();
	
	public void stop() {
		System.out.println("Electric car is stopping by pushing the break...");
	}

	//GETTERS AND SETTERS
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	//TOSTRING
	
	@Override
	public String toString() {
		return "ElectricCar [model=" + model + ", price=" + price + ", color=" + color + "]";
	}
	
	
	
	
	
	
	

}
