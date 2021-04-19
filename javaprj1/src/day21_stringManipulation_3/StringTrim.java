package day21_stringManipulation_3;

public class StringTrim {

	public static void main(String[] args) {
		// trim() method removes whitespaces from BOTH ends of a string, NOT in between spaces
		
		String str1 = "    Programming is fun!";
		System.out.println(str1.trim());
		
		String str2 = "Programming is fun!    ";
		System.out.println(str2.trim());
		
		String str3 = "    Programming is fun!    ";
		System.out.println(str3.trim());
		
		String str4 = "  Prog ramm  ing is fun  !"; 
		System.out.println(str4.trim());				// removed spaces only from starting and ending parts, not in between
		
		//Write a program to display |342| from given string
		String str = " 342 ";
		System.out.println("|" + str.trim() + "|");
				

	}

}
