package day30_WrapperClass;

public class Boxing {
	
	public static void main(String[] args) {
		
		//AUTOBOXING - > primitive to object
		Integer num1 = 1234;		// int converted to object
		int n = 5;						
		Integer num2 = n;			// int converted to object
		
		
		//UNBOXING -> object to primitive
		Double d1 = new Double(34.2);	// new object created
		double d2 = d1;					// object converted to primitive
		System.out.println("d1: " + d1);
		System.out.println("d2: " + d2);
		
		
		long l1 = new Long(60000000000L); 	// object to primitive: unboxing
		Long l2 = new Long(345699459);		// new object created
		long l3 = l2;						// object to primitive: unboxing
		
		int i1 = 345;
		double dd1 = i1; // implicit casting
		Integer i2 = new Integer(345);
//		Double dd2 = i2; // Type mismatch: implicit casting for wrapper classes does NOT work.
		
		
		
		
		
		
	}

}
