package day15_methods_3;

public class MethodOverloading {

	public static void main(String[] args) {

		System.out.println("Sum of integers: " + sum(2,3,6));

	}
	
	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static int sum(int a, int b, int c) {
		return a+b+c;
	}
	
	public static int sum(int a, int b, int c, int d) {
		return a+b+c+d;
	}	
}

/*
		1- Number of parameters:
			add(int, int)
			add(int, int, int)
		 
		2- Data Type of Parameters:
			add(int, int)
			add(int, float)
		 
		 3- Sequence of data type parameters:
		 	add(int, float)
		 	add(float, int)
		 	
		 4- Invalid case - not overloading:
		 	int add(int, int) 	//return type
		 	float add(int, int)	//return type
 */
