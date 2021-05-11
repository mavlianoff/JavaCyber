package week7;

public class WrapperClasses_I {
	
	public static void main(String[] args) {
		
		/*
		8 wrapper classes: Byte - Short - Integer - Long - Float - Double - Character - Boolean
		NOTE: these classes loyal to own primitive data type
		 */
		
		int a = 10;
		long l1 = a;
//		Long l2 = a; // ERROR: wrpper class is only dedicated to its own primitive data type
		Long l2 = (long)a;
		
		double m = 2.5;
		Double d1 = m; // auto-boxing
		
		Double d2 = 10.5;
		double p = d2; // un-boxing
		
		Double d3 = d2; //no conversion
		
		double r = p;   //no conversion
		
		
		
		
		
		
	}

}
