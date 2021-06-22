package week12;

public class Rectangle extends Shape {
	// 2 (MANDATORY)reasons of errors in line 3
	
	
	//1- if any constructor to be called
		
	public double l, w;
	
	public Rectangle(double l, double w) {
		super("Rectangle");
		this.l = l;
		this.w = w;
	}

	//2- if any unimplemented methods to be overriden
	
	@Override
	public double area() {
		return l*w;
	}

	@Override
	public double perimeter() {
		return 2*(l+w);
	}
	
	

}
