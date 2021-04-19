package day22_stringManipulation_Lab;

public class Lab3_Q3_extraEnd {

	public static void main(String[] args) {
		/*
		Create a method return a new string made of 3 copies of the last 2 chars of the original string. 
		The string length will be at least 2.
		
			extraEnd("Hello") → "lololo"
			extraEnd("ab") → "ababab"
			extraEnd("Hi") → "HiHiHi"
		 */
		
		System.out.println(extraEnd("Hello"));
		System.out.println(extraEnd("ab"));
		System.out.println(extraEnd("Hi"));

	}
	
	public static String extraEnd(String str) {
		if(str.length()<2) {
			return "Invalid String";
		}
		
		String lastLetters = str.substring(str.length()-2);
		return lastLetters + lastLetters + lastLetters;
	}

}
