package week4;

public class Rectangle {
	
	
	// (1) Attributes:
	
	public double length;
	public double width;
	
	
	// (2) Actions/Behaviours:
	
	public double area(){
		return length * width;
		
	}
	
	public double perimeter() {
		return 2 * (length + width);
	}

	@Override					// TIP: Right click -> Source -> Generate toString();
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", area=" + area() + ", perimeter=" + perimeter() + "]";
	}
	
	

}
