package day4_Arithmetic_Operators;

public class additionConcatenate {

	public static void main(String[] args) {
		// Number + Number => Addition
		System.out.println(20+200);
		
		//Number + String => Concatenation
		System.out.println(5+"Hello!");
		
		//String + String => Concatenation
		System.out.println("Hello"+" world!");
		
		//Boolean + Number
//		System.out.println(true+1); // Java throws error as true is not 1 in Java unlike Javascript
		
		//Complex cases
		System.out.println(2+0+3+"Cybertek");
		System.out.println("Cybertek"+2+0+3);
		System.out.println(2+0+3+"Cybertek"+2+0+3);
		System.out.println(2+0+3+"Cybertek"+(2+0+3));

	}

}
