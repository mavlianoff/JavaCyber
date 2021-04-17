package day5_unary_assignment_relational_logical_Operators;

public class task21_prepost_IncrementDecrement {

	public static void main(String[] args) {
		
		int x = 4;
		int y = x * 4 - x++; // 4*4-4=12
		int z = x * 4 - ++x; // 5*4-6=14
		
		System.out.println(y); // 12
		System.out.println(z); //14
		System.out.println(x); //6
		

	}

}
