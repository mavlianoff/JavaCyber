package week4;

public class CircleObjects {
	
	public static void main(String[] args) {
		
		Circle circle1 = new Circle(); //created new object with method with same data type and assign to ref variable to be re-usable
		circle1.radius = 3;
		System.out.println(circle1); // // We want to print newly created object with its attributed + behaviours.
		
		Circle circle2 = new Circle();
		circle2.radius = 5;
		System.out.println(circle2);
			
		// PRIOR toString() method defined in class:
		// Outcome: week4.Circle@26f0a63f - machine ca not read part: @26f0a63f
		// toString() method is what you need to convert hash data
		
		// POST toString() method defined in class:
		// Outcome: Radius 0.0, Area: 0.0, Perimeter: 0.0    ==> provided default values: 0.0
		// toString() method is added to class without method name modification.
		
//		System.out.println(circle1.toString()); // still, method has to be defined in class in order to use it here.
		
		// toString() ==> only ONE mission: to convert object to String
									
		
	}

}
