package week9;

public class Circle {
	
	public double radius;
	
	//CONTRUCTOR
	public Circle (double radius) {
//		this.radius = radius; 		//called setter to insert constraint into constructor input
		setRadius(radius);
	}
	
	
	//GETTER
	public double getRadius() {
		return radius;
	}

	//SETTER
	public void setRadius(double radius) {
		if(radius<=0) {
			System.err.println("Invalid radius");
			return;
		}
		this.radius = radius; // IMPORTANT: this line cannot go before if condition as it sets radius before checking conditions
	}

	//METHOD: Area
	public double getArea() {
		return Math.pow(radius, 2) * Math.PI;
	}
	
	//METHOD: Perimeter
	public double getPerimeter() {
		return radius * 2 * Math.PI;
	}

	
	
	public String toString() {
		return "Circle [radius=" + radius + ", Area=" + getArea() + ", Perimeter=" + getPerimeter() + "]";
	}
	
	

}
