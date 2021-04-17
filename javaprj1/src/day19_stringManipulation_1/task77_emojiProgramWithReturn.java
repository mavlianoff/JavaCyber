package day19_stringManipulation_1;

public class task77_emojiProgramWithReturn {

	public static void main(String[] args) {
		
		/*
		Create a emoji program:
		1-Checkifemojihas 2 characters. If it is not, print “invalid emoji”
		2-Valid emojis:
			Starting with := > :)Smile,:(Sad,:/Upset,:pPlayful,Otherwise invalid
			Starting with ; = > ;)Wink, ;0 Surprised, Otherwise invalid
		 */
		

		String emoji=";0";
		
		if(emoji.length() !=2 ) {
			System.out.println("Invalid emoji");
			return; // stops execution of main method. NOTE: break is used for loops
		}
		
		//if code reaches to this point then it means chars are 2
		//get first and second chars amd assign to variable
		
		char first=emoji.charAt(0);
		char second=emoji.charAt(1);
		
		if(first==':') {
			if(second==')') {
				System.out.println("Smile");
			}else if(second=='(') {
				System.out.println("Sad");
			}else if(second=='/') {
				System.out.println("Upset");
			}else {
				System.out.println("Unknown emoji");
			}
			
		}else if(first==';') {
			if(second==')') {
				System.out.println("Wink");
			}else if(second=='0') {
				System.out.println("Surprised");
			}else {
				System.out.println("Unknown emoji");
			}	
		}
	}
}
