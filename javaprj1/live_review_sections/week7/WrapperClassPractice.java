package week7;

public class WrapperClassPractice {
	
	public static void main(String[] args) {
		
		String str = "a1b2c3d4e5f6";
		//TASK: find sum of digits
		
		int sum = 0;
		
		for(char each: str.toCharArray()) {			// IMPORTANT: YOU CAN USE CHARTOARRAY TO CONVERT STRING TO CHAR
			if(Character.isDigit(each)) {
//				sum += Integer.parseInt(each);		//This line gives error because parseint accepts only String, therefore
				sum += Integer.parseInt("" + each);
			}
			
		}
		System.out.println(sum);
		
		System.out.println("============================");
		
		String word = "abc@!de$f%ghi1kl2m3n4b5v6";
		//TASK: find only special characters
		
		String specialCharacters = "";
		int i=0;
		for(char each: word.toCharArray()) {
			if( !(Character.isLetterOrDigit(each)) ) {
				specialCharacters += each;
			}
		}
		System.out.println(specialCharacters);
		
		
		
		
	}

}
