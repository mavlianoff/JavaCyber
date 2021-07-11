package day45_exceptions;

public class TryCatch {
	
	public static void main(String[] args) {
		
//		String str = "Java";
//		System.out.println(str.charAt(0));		// J
//		System.out.println(str.charAt(5));		// out of bound
//		System.out.println(str.charAt(1));		// can't run, error not handled
		
		
		try {
			
			String str = "Java";
			System.out.println(str.charAt(0));
			System.out.println(str.charAt(5));	
			System.out.println(str.charAt(1));
			
		}catch(Exception e) {
			
			System.out.println("Exception happened in try block and was caught");
			//EXCEL
			
		}
		
		System.out.println("After try catch block");
		
		
	}

}
