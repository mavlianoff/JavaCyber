package day13_methods_1;

public class task58_GreaterNumber {

	public static void main(String[] args) {

		greaterNumber();

	}
	
	public static void greaterNumber() {
		
		int i1=2;
		int i2=2;
		
		if (i1>i2) {
			System.out.println(i1 + " is bigger than " + i2);
		}else if(i2>i1) {
			System.out.println(i2 + " is bigger than " + i1);
		}else {
			System.out.println(i1 + " and " + i2 + " are equal");
		}
		
	}

}
