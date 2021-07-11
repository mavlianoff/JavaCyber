package day45_exceptions;

public class TryCatch2 {
	
	public static void main(String[] args) {
		
		int[] nums = {36, 6, 34, 56};
		
//		System.out.println(nums{0]); 	// compile error
		
		try {
			System.out.println(nums[6]);
		}catch(Exception e) {
//			System.out.println("Wrong index");
			e.printStackTrace();
//			e.getMessage(); // returns there println needed
			System.out.println(e.getMessage());
			
		}
		
		try {
			int j=100;
			int n=j/0;
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

}

//1-COMPILE ERROR - Syntax, etc
//2-RUNTIME ERROR - no memory or infinite loop
//3-RUNTIME EXCEPTION - runtime code block exception for handling
