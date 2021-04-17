package day19_stringManipulation_1;

public class task76_displayEachCharacter {
	
	public static void main(String[] args) {
		
		//Display each character in the console.
		
		String str="Cybertek School";
		System.out.println("Number of characters: " + str.length());
		
		for(int i=0; i<str.length(); i++){
			System.out.println("Character at index " + i + " is: " + str.charAt(i));
		}
	}	
}


