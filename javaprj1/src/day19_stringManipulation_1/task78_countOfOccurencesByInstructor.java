package day19_stringManipulation_1;

public class task78_countOfOccurencesByInstructor {

	public static void main(String[] args) {
	/*	
		Write a program to count the number of occurrences for specific char 
		String word = "abcabqcabc”
		Number of a in this string is: 3
	 */

	String word="abcabqcabc";
	char myChar='q';
	
	int counter=0;
	
	for(int i=0; i<word.length(); i++) {
		if(word.charAt(i)==myChar) {
			counter++;
		}
	}
	
	System.out.println("The number of " + myChar + " in this string is: " + counter);

	}

}
