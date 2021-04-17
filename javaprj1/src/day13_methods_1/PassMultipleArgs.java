package day13_methods_1;

public class PassMultipleArgs {

	public static void main(String[] args) {

		showSum(8,11.11);
		

	}
	
	public static void showSum(int i1, double d1) {
		double sum=i1+d1;
		System.out.println("Sum of these two number is: " + sum);
	}

}
