package day15_methods_3;

public class assignment3_FibonacciNumbers {

	public static void main(String[] args) {

		int count=9; //8 count max 
		int pre1=0, pre2=1;
		System.out.println("This is Fibonacci series of 8 numbers");
		
		for (int i=1; i < count; i++) {
			
			System.out.print(pre2+ " ");
			
			int sumOfPrevTwo=pre1+pre2;
			pre1=pre2;
			pre2=sumOfPrevTwo;
		}

	}

}
