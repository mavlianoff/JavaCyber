package day5_unary_assignment_relational_logical_Operators;

public class mixedInteger {

	public static void main(String[] args) {


		int i1=5;
		int i2=10;
		float f1=15.5f;
		double d1=20.5;
		
		int res1=i1+i2; 	// res1 should be int or higher, ex: double.
		float res2=i1+f1;	// res2 should be float (or higher) as f1 is float > int
		double res3=i2+d1;	// res3 should be double or higher
		
		short num1=10;
		short num2=20;
		
//		short num3=num1+num2; 	//this gives error due to Java rule: data types smaller than int (byte & short) will be temporarily converted to int  
								//while doing arithmetics operations, therefore, result expected to be int as per JAVA
		int num3=num1+num2;		//this is correct setup as per Java MixedInteger rule
		
		//OR, THIS CAN BE FIXED BY CASTING:
		short num33 = (short) (num1+num2);
				
		
	}

}
