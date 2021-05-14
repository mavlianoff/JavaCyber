package day33_ClassObjects_Constructors;

public class Car {
	
	String model;
	String make;
	int year;
	double mile;
	String color;
	
	public Car() {
		model = "Honda";
		make = "Civic";
		year = 2020;
		mile = 5000;
		color = "red";
	}
	
	/*
	
	public Car(String mo, String ma, int yr, double ml, String cl) {
		model = mo;
		make = ma;
		year = yr;
		mile = ml;
		color = cl;
		
	}
	
	public Car(String model, String make, int year, double mile, String color) {
		this.model = model; // this.object ==> current object
		this.make = make;
		this.year = year;
		this.mile = mile;
		this.color = color;
	}
	
	*/
	
	//Right-click => source => Generate Constructor with Fields
	public Car(String model, String make, int year, double mile, String color) {
		this.model = model;
		this.make = make;
		this.year = year;
		this.mile = mile;
		this.color = color;
	}
	
	

}
