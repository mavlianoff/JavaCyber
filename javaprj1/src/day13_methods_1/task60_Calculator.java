package day13_methods_1;

public class task60_Calculator {

	public static void main(String[] args) {
		/*
		Write a method that accepts 3 parameters:
		1- number
		2- number
		3- operator(-,+,*,/) 
		Sample output:
		calculator(6,3, “+”) -- > 9
		calculator(6,3, “-”) -- > 3
		calculator(6,3, “*”) -- > 18
		calculator(6,3, “/”) -- > 2
		 */
		
		simpleCalculator(6,3,"/");
		simpleCalculator(9,6,"/");
		simpleCalculator(12,4,"/");
		simpleCalculator(18,2,"/");
						

	}
	
	public static void simpleCalculator(int n1, int n2, String operator) {
		
		double result=0;
		
		switch(operator) {
		
		case "-":
			result=n1-n2;
			break;
			
		case "+":
			result=n1+n2;
			break;
			
		case "*":
			result=n1*n2;
			break;
			
		case "/":
			result=n1/n2;
			break;
		
		default:
			System.out.println("Invlid Operator");
		}
		System.out.println(result);
	}

}
