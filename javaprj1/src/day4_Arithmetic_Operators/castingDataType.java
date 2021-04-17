package day4_Arithmetic_Operators;

public class castingDataType {

	public static void main(String[] args) {
		// IMPLICIT CASTING = ACCOMODTING SMALLER DATA TYPE INTO BIGGER TYPE - Done auto automatically
		
		double d=20; //By default, 20 is integer which is smaller than double but it is being converted into double type
		System.out.println(d + " --> This is (decimal) double number now");
				
		
		
		
		// EXPLICIT CASTING = ACCOMODATING BIGGER DATA TYPE INTO SMALLER TYPE - Done by programmer
		int x=120;
		byte b= (byte) x;
		System.out.println(x + " ---> It is integer data");
		System.out.println(b + " ---> It is byte data");

	}

}
