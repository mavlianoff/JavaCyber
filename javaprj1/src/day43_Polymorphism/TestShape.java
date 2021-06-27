package day43_Polymorphism;

public class TestShape {
	
	public static void main(String[] args) {
		
		Shape s1 = new Shape();
		s1.draw();
		
		Shape s2 = new Circle();
		s2.draw(); 					// if Overriden: Child class methods runs
									// if NOT Overriden: Parent class method runs
		
	}

}
