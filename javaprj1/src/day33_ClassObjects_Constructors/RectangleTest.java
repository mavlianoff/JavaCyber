package day33_ClassObjects_Constructors;

public class RectangleTest {

	public static void main(String[] args) {
		
		//WITH CONTRUCTOR!!!
		
		Rectangle R1 = new Rectangle(5.4, 3.2); //reaching to constructor in class with parameter 
		// 'new' keyword invokes constructor
		// which constructor?
		//accepting 2 arguments which are doubles
		Rectangle R2 = new Rectangle();			//reaching to constructor in class with no argument => DEFAULT constructor created by Java 
		Rectangle R3 = new Rectangle();			//reaching to constructor in class with no argument => DEFAULT constructor created by Java
		
		System.out.println(R1.length);
		System.out.println(R1.width);
		
		
//		//WITH CONVENTIONAL INITIALIZATION!!!
//		Rectangle R1 = new Rectangle();
//		
//		System.out.println(R1.length); //who is giving me default values?
//		System.out.println(R1.width);
//		
//		R1.length = 5.4;
//		R1.width = 3.2;
//		
//		R1.getArea();
//		
//		Rectangle R2 = new Rectangle();
//		
//		R2.length = 2.7;
//		R2.width = 12.5;
//		
//		R2.getArea();
		
	}

}