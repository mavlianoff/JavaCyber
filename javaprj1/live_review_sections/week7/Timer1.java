package week7;

import java.util.Scanner;

public class Timer1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter seconds: ");
		int seconds = scan.nextInt();
		
		for(int i=seconds; i>=0; i--) {
			System.out.println(i + " seconds");
			Thread.sleep(1000);
		}
		
	}

}
