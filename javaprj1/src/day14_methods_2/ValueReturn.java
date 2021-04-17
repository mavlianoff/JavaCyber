package day14_methods_2;

public class ValueReturn {

	public static void main(String[] args) {
		
//		sum(2,3);		// and returned value (line 20) is stored under called method, therefore declare tthird variable to be able to use
		int v1=sum(2,3);
		System.out.println(v1);
		System.out.println(v1*5);

	}
	
//	public static void sum(int num1, int num2) {
	public static int sum(int num1, int num2) {
		
		int result=num1+num2;
		System.out.println(result);
		
		return result;  //after changing void to int, return command should be added.
	}

}
