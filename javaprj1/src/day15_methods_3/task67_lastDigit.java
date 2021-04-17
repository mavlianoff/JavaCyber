package day15_methods_3;

public class task67_lastDigit {

	public static void main(String[] args) {
		
		/*
		Write a method that accepts 2 numbers and return if they have the same last digit.
		Sample Output
		lastDigit(7,17) - >true
		lastDigit(6,17) - >false
		lastDigit(3,113) - >true
		 */
		
		if(lastDigit(0,0)) {
			System.out.println("Same last digit");
		}else {
			System.out.println("NOT same last digit");
		}
		
//		lastDigit(6,17);
//		lastDigit(3,113);

	}
	
	public static boolean lastDigit(int num1, int num2) {
		
		if((num1%10) == (num2%10)) {
			return true;
		}else {
			return false;
		}
		
	}

}
