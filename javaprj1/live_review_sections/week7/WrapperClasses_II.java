package week7;

public class WrapperClasses_II {
	
	public static void main(String[] args) {
		
		//parse methods: 	string to primitive
		//valueOf methods: 	string to wrapper class
		
		String str = "12";
		
		System.out.println( str + 1);
		System.out.println(Integer.parseInt(str) + 1);
		System.out.println(Integer.valueOf(str) +1);
		
		
	}

}
