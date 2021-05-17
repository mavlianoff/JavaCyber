package week8;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice2 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter number: ");
			list.add( scan.nextInt() );
			
			System.out.println("Want to add another number? ");
			String answer = scan.next().toLowerCase();
			
			if(answer.equals("no")) {
				break;
			}
			
		}
		System.out.println(list);
		
		
		
		
		
	}
	
	
	
}
