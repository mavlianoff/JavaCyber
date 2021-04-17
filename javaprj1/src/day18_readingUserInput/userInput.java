package day18_readingUserInput;

import java.util.Scanner;
//import java.util.*; all classes from package

public class userInput {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print(" Enter byte value:");
		byte b1=scan.nextByte();
		System.out.println("Byte value is: " + b1);
		
//		System.out.println(b1);
//		System.out.println(b1*4);
//		System.out.println(b1%3);

//		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a short value: ");
		Short s1 = scan.nextShort();
		System.out.println("Short value is: " + s1);
		
//		Scanner scan=new Scanner(System.in);
		System.out.println("Enter int value: ");
		int i1=scan.nextInt();
		System.out.println("Int value is: " + i1);
		
//		Scanner scan=new Scanner(System.in);
		System.out.println("Enter long value: ");
		Long l1=scan.nextLong();
		System.out.println("Long valie is: " + l1);
		
//		Scanner scan=new Scanner(System.in);
		System.out.println("Enter double value: ");
		double d1=scan.nextDouble();
		System.out.println("Double value is: " + d1);
		
//		Scanner scan=new Scanner(System.in);
		System.out.println("Enter boolean value: ");
		boolean bool=scan.nextBoolean();
		System.out.println("Boolean value is: " + bool);
		
	}

}
