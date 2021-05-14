package day33_ClassObjects_Constructors;

public class Rectangle {
	
	double length;
	double width;

	
	public void getArea() {
		System.out.println(length * width);
	}
	
	//created  constructor (NOTE: Constructor must be created in Class with same Class name)
	//accepts 2 arguments
	public Rectangle(double a, double b) {
		length = a;
		width = b;
	}
	
	public Rectangle() {
		length = 5.4;
		width = 2.7;
	}

}