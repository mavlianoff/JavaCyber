package day19_stringManipulation_1;

public class CharAt {
	
	public static void main(String[] args) {
		
		String word="Computer";
		System.out.println(word.length());
		
		System.out.print(word.charAt(0));
		System.out.print(word.charAt(1));
		System.out.print(word.charAt(2));
		System.out.print(word.charAt(3));
		System.out.print(word.charAt(4));
		System.out.print(word.charAt(5));
		System.out.print(word.charAt(6));
		System.out.println(word.charAt(7));
//		System.out.print(word.charAt(8)); // there is no 8th indexed char
		
		//Task: check if the first character is 'A'
		String word1="Apple";
		
		if(word1.charAt(0)=='A') {
			System.out.println("A is first character");
		}else {
			System.out.println("A is NOT the first character");
		}
		
		//Task: check if first and last characters are same:
		String word3="civic";
		if(word3.charAt(0) == word3.charAt(4)) {
			System.out.println("First and Last characters are same");
		}else {
			System.out.println("First and Last characters are NOT same");
		}
		
		//Last index not hard coded:
		String word4="Java";
		int lastCharIndex=word4.length()-1;
		if(word4.charAt(0) == word4.charAt(lastCharIndex)) {
			System.out.println("First and Last characters are same");
		}else {
			System.out.println("First and Last characters are NOT same");
		}

	}

}
