package day5_unary_assignment_relational_logical_Operators;

public class task20_prepost_IncrementDecreament {

	public static void main(String[] args) {
		
		int a=1;
		int result = -a-- + a++ /-a-- * --a; // -1 + 0 /- 1 * (-1)
				
		System.out.println("final arithmetic result = " + result);
		System.out.println("final value of a = " + a);

	}

}
