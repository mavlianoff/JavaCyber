package day19_stringManipulation_1;

public class task78_countOfOccurences {

	public static void main(String[] args) {
		/*
		Write a program to count the number of occurrences for specific char 
			String word = "abcabqcabc”
			Number of a in this string is: 3
		 */
	
		String word="abcabqcabc";
		int aBucket=0;
		int bBucket=0;
		int cBucket=0;
		int qBucket=0;
		
		for(int i=0; i<word.length(); i++) {
			if(word.charAt(i)=='a') {
				aBucket+=1;
			}else if(word.charAt(i)=='b') {
				bBucket+=1;
			}else if(word.charAt(i)=='c') {
				cBucket+=1;
			}else if(word.charAt(i)=='q') {
				qBucket+=1;
			}else {
			}
		}
		System.out.println("Number of a in this string is: " + aBucket);
		System.out.println("Number of b in this string is: " + bBucket);
		System.out.println("Number of c in this string is: " + cBucket);
		System.out.println("Number of q in this string is: " + qBucket);
	

	}

}
