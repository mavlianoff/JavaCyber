package day22_stringManipulation_Lab;

public class Lab3_Q10_frontAgain {

	public static void main(String[] args) {
		/*
		Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".
			frontAgain("edited") → true
			frontAgain("edit") → false
			frontAgain("ed") → true
		 */
		
		System.out.println(frontAgain("edited"));
		System.out.println(frontAgain("edit"));
		System.out.println(frontAgain("ed"));

	}
	
	//SOLUTION 1:
//	public static String frontAgain(String str) {
//		if(str.substring(0, 2).equals(str.substring(str.length()-2))) {
//			return "true";
//		}else {
//			return "false";
//		}
//	}
	
	//SOLUTION 2:
	public static boolean frontAgain(String str) {
		
		String first2 = str.substring(0, 2);
		String last2 = str.substring(str.length()-2);
		return first2.equals(last2);
		
		
	}

}
