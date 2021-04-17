package day18_readingUserInput;

import java.util.Scanner;

public class readingUserInput2 {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Provide word/sentence, i will repeat it: ");
//		String str = scan.next();		//use next() in case you input single word!
//		System.out.println(str);
		String str2 = scan.nextLine();	//can be used for single as well as set of words with space!
		System.out.println(str2);

		
	}

}
