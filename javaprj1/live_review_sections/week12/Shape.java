package week12;

//public class Shape {				// check once completed line 16
public abstract class Shape {		// NOTE: abstract class meant to be a parent therefore final & abstract never come together: public final abstract Class

	public final String name;
	
	public Shape(String name) {
		this.name = name;
	}
	
	
	//In abstraction method is created without implementation body and it is meant to be overriden
//	public static double area();	// static method cannot be overriden
//	public final double area();		// final method cannot be overriden
//	public double area();			//ERR, incomplete method syntax
	
	public abstract double area();	//ERR, still red flag in line 3 and line 18. Solution: line 4, add abstract to class
	
	public abstract double perimeter();


	@Override
	public String toString() {
		return "Shape [name=" + name + ", area()=" + area() + ", perimeter()=" + perimeter() + "]";
	}
	
	
	
	

}
