package week9;

public class CircleObjects {
	
	public static void main(String[] args) {
		
		Circle circle = new Circle(5);
		
//		circle.radius = 10;	
//		circle.radius = -1;	
								// as it is 'public', anyone can access and input radius
								// as it is 'public', anyone can enter any [nonlogical] inputs
								// no control over inputs as it is public therefore converted to 'private'
		System.out.println(circle);
		
//		circle.setRadius(-1);
//		System.out.println(circle);
		
		System.out.println("====================================");
		
		Circle circle2 = new Circle(-3);
		System.out.println(circle2);
		
		System.out.println("====================================");
		
		Circle circle3 = new Circle(1);
		System.out.println(circle3);
		
		System.out.println("====================================");
		
		Circle circle4 = new Circle(2);
		System.out.println(circle4);
		
		
	}

}
