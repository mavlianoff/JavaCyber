package day30_WrapperClass;

public class WrapperClass {
	
	public static void main(String[] args) {
		
		System.out.println("===================");
		int n1 = 10;					// primitive data
		Integer n2 = new Integer(10);	// object
		System.out.println(n1 + " " + n2);
		
		System.out.println("===================");
		double d1 = 44.5;
		Double d2 = new Double(44.5);		// The constructor Double(double) is depreciated since version 9
		Double d3 = new Double("44.5"); 	// The constructor Double("String") is depreciated since version 9
		Double d4 = Double.valueOf(44.5);	// This is the new method for above depreciation since version 9
		System.out.println(d1 + " " + d2 + " " + d3 + " " + d4);
		System.out.println(d1 + d2 + d3);				// sum of objects
		
		System.out.println("===================");
		char ch1 = 'a';
		Character ch2 = new Character('a');
		Character ch3 = Character.valueOf('a');
		System.out.println(ch1 + " " + ch2 + " " + ch3);
		
		System.out.println("===================");
		byte b1 = 100;
		Byte b2 = new Byte((byte)10);  // 10 is int and requires casting to byte
		System.out.println(b1 + " " + b2);
		
		System.out.println("===================");
		Integer num1 = Integer.valueOf(1234);	// Method to replace depreciated constructors
		System.out.println(num1);
		
		System.out.println("===================");
		Boolean bool1 = Boolean.valueOf(true);
		Boolean bool2 = Boolean.valueOf("true");
		System.out.println(bool1 + " " + bool2);
		
		System.out.println("===================");
		
	}

}
