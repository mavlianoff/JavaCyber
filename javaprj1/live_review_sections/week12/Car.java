package week12;

public abstract class Car {
	
	public String model, make, color;
	public int year;

	public Car(String model, String make, String color, int year) {
		super();
		this.model = model;
		this.make = make;
		this.color = color;
		this.year = year;
	}

	public abstract void start();

	@Override
	public String toString() {
		return "Car [model=" + model + ", make=" + make + ", color=" + color + ", year=" + year + "]";
	}
	
	
	

}
