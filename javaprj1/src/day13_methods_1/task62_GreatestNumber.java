package day13_methods_1;

public class task62_GreatestNumber {

	public static void main(String[] args) {
		
		/*
		Write a method that accepts 3 numbers and displays the greatest one in the console. 
		Sample Output:
		calculateGreatest(5,2,3) -- >5
		 */
		
		greatestNumber(4,4,4);

	}
	
	public static void greatestNumber(int n1, int n2, int n3) {
		if(n1>n2 && n1>n3) {
			System.out.println("n1 greatest");
		}else if(n2>n1 && n2>n3) {
			System.out.println("n2 greatest");
		}else if(n3>n1 && n3>n2) {
			System.out.println("n3 greatest");
		}else {
			System.out.println("all equal");
		}
	}

}
