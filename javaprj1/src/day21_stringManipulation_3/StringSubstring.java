package day21_stringManipulation_3;

public class StringSubstring {

	public static void main(String[] args) {

		String sentence = "Java String Manipulation is fun";
		                // 1234567890123456789012345678901
		System.out.println(sentence.substring(2));
		System.out.println(sentence.substring(5,11));
		System.out.println(sentence.substring(5, sentence.length()-5));
		
		String chars = "{{}}";
		String word = "AUTOMATION";
		//task: print {{AUTOMATION}}
		System.out.println(chars.substring(0, 2) + word + chars.substring(2));

	}

}
