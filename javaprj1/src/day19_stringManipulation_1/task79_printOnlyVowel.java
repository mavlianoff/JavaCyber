package day19_stringManipulation_1;

public class task79_printOnlyVowel {

	public static void main(String[] args) {
		/*
		Write a program to print only vowel (a,e,o,i,u) in given string
		String word = "CybertekSchool";
		Output:e,e,o,o
		 */
		
		String word="CybertekSchool";
		
		for(int i=0; i<word.length(); i++) {
			char letter=word.charAt(i);
			if(letter=='a' || letter=='e'|| letter=='o'|| letter=='i' || letter=='u') {
//				System.out.print(letter);  //INCORRECT: NO COMMA SEPARATED
//				System.out.print(letter + ","); //INCORRECT: COMMA ON LAST LETTER
				
				System.out.print(letter);
				if(i != word.length()-2) {
					System.out.print(",");
				}
				
			}
		}

	}

}
