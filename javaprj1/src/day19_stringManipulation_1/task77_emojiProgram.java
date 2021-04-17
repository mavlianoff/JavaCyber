package day19_stringManipulation_1;

import java.util.Scanner;

public class task77_emojiProgram {
	
	public static void main(String[] args) {
		
		/*
		Create a emoji program:
		1-Checkifemojihas 2 characters. If it is not, print “invalid emoji”
		2-Valid emojis:
			Starting with := > :)Smile,:(Sad,:/Upset,:pPlayful,Otherwise invalid
			Starting with ; = > ;)Wink, ;0 Surprised, Otherwise invalid
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Please express your current status with simple emoji: ");
		String userInput = scan.nextLine();
		
		if(userInput.length()==2) {
			if(userInput.charAt(0)==':') {
				if(userInput.charAt(1)==')') {
					System.out.println(" :) => Smile");
				}else if(userInput.charAt(1)=='(') {
					System.out.println(" :( => Sad");
				}else if(userInput.charAt(1)=='/') {
					System.out.println(" :/ ==> Upset");
				}else if(userInput.charAt(1)=='p') {
					System.out.println(" :p ==> Playful");
				}else {
					System.out.println("Invalid emoji :(");
				}
			}else if(userInput.charAt(0)==';') {
				if(userInput.charAt(1)==')') {
					System.out.println(" ;) => Wink");
				}else if(userInput.charAt(1)=='0') {
					System.out.println(" ;0 => Surprised");
				}else if(userInput.charAt(1)=='/') {
				}else {
					System.out.println("Invalid emoji :(");
				}
			}
			
		}else {
			System.out.println("Invalid emoji :(");
		}
		
	}

}
