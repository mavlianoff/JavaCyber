package day20_stringManipulation_2;

public class StringEquals {

	public static void main(String[] args) {

		String str1="Welcome to Java";
		String str2="Welcome to Java";
		String str3="Welcome to C++";
		
		boolean b1 = str1.equals(str2);	//same content in heap memory
		boolean b2 = str1.equals(str3);
		
		System.out.println(b1 + "|" +b2);
		
		boolean b3 = str1==str2; 		//same objects in heap pool
		boolean b4 = str1==str3;
		
		System.out.println(b3 + "|" +b4);
		
		String str4 = new String("Welcome to Java");
		System.out.println(str1==str4);			//false as objects are NOT from same pool
		System.out.println(str1.equals(str4));	//true because content is same
		
		String str5 = "WelCOME to JAVA";
		System.out.println(str1.equalsIgnoreCase(str5)); //TRUE as this method ignores capital vs lower cases

	}

}
