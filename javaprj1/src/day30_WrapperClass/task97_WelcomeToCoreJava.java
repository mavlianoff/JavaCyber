package day30_WrapperClass;

public class task97_WelcomeToCoreJava {
	
	public static void main(String[] args) {
		
		String s = "(((W&e**_lco73me %t%o co!@$,,<r>e <J>>>$@av```~a777.||}{";
		
		System.out.println(returnWelcome(s));
		
	}
	
	public static String returnWelcome(String str) {
		
		String newStr = "";
		
		for(int i=0; i<str.length(); i++) {
			
			if(Character.isAlphabetic(str.charAt(i)) || str.charAt(i)==' ') {
				
				newStr = newStr + str.charAt(i);
			}
		}
		return newStr;
		
	}

}
/*
 String str = "(((W&e**_lco73me %t%o co!@$,,<r>e <J>>>$@av```~a777.||}{";
 Write a method that returns : Welcome to core Java
 */
