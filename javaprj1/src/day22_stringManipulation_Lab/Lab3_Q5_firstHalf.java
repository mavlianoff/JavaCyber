package day22_stringManipulation_Lab;

public class Lab3_Q5_firstHalf {

	public static void main(String[] args) {
		/*
		Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
			firstHalf("WooHoo") → "Woo"
			firstHalf("HelloThere") → "Hello"
			firstHalf("abcdef") → "abc"
		 */
		
		System.out.println(firstHalf("WooHoo"));
		System.out.println(firstHalf("HelloThere"));
		System.out.println(firstHalf("abcdef"));

	}
	
	public static String firstHalf(String str) {
		int half = str.length()/2;
		return str.substring(0, half);
//		return str.substring(0, str.length()/2);
	}

}
