package day42_Interface;

public abstract class ElectricTruck extends ElectricCar{
	
	//CONSTRUCTORS
	
	public ElectricTruck(String model, double price, String color) {
		super(model, price, color);

	}

	//METHODS										//ABSTRACT CLASS MUST NOT OVERRRIDE METHODS
	
	public abstract void load(String item);
	
}
