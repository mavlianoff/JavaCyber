package day25_Arrays_part2;

import java.util.Scanner;

public class PassArray {

	public static void main(String[] args) {
		// create array
		int[] numbers = new int[4];
		
		//pass array to the getValues method
		getValues(numbers);
		
		System.out.print("Here are the numbers that you entered: ");
		
		//pass array to showArray method
		showArray(numbers);

	}
	
	public static void getValues(int[] array) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter series of " + array.length + " numbers: ");
		for(int i=0; i<array.length; i++) {
			System.out.print("Please enter number " + (i+1) + " :");
			array[i] = scan.nextInt();
		}
	}
	
	public static void showArray(int[] array) {
		for(int value: array) {
			System.out.print(value + " ");
		}
	}

}
