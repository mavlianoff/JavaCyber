package week4;

public class Circle {
	
	//Class has (1) Attributes and (2) Actions/Behaviours
	
	// (1)Circle attribute: RADIUS
	public double radius; // public because it shall be used accross packages
	
	// (2) Actions/Behaviours: calculateArea, calculatePermieter
	public double calculateArea() {			// instance variable -> multiple object (circle 1, circle , etc) uses it, therefore no 'STATIC'
		return radius * radius * Math.PI;
	}
	
	public double calculatePerimeter(){		// instance variable -> multiple object (circle 1, circle , etc) uses it, therefore no 'STATIC'
		return radius * 2 * 3.14;
	}
	
	public String toString() {		// action to convert to String
		return "Radius " + radius
				+ ", Area: " + calculateArea()
				+ ", Peremeter: " + calculatePerimeter();
	}

}
