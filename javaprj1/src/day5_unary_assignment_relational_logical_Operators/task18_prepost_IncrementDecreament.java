package day5_unary_assignment_relational_logical_Operators;

public class task18_prepost_IncrementDecreament {

	public static void main(String[] args) {
		
		
		System.out.println("Example 1:");
		int x=2;
		int y=x++;						//First assign x to y and then increment x by 1: y=2, x=3
		System.out.println(x); //3
		System.out.println(y); //2
		
		
		System.out.println("Example 2:");
		int a=2;
		System.out.println(a++); //2	//print a and then increment a in next line
		System.out.println(a);
		
	
		System.out.println("Example 3:");
		int b=2;
		System.out.println(--b); //1	//decreament first and then print it
		System.out.println(b);
		
		
		System.out.println("Example 4:");
		int c=8;
		int z=c--;						//assign c to z first, and then  decreament c
		System.out.println(c); //7		
		System.out.println(z); //8
		
		System.out.println("Video example");
		int i=50;
		int result= --i + i++ + i-- +i++; //49 + 49 + 50 + 49
		System.out.println(result);
		
		
				

	}

}
