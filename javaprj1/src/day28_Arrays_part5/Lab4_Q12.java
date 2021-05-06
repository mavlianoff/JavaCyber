package day28_Arrays_part5;

public class Lab4_Q12 {
	
	public static void main(String[] args) {
		
		int[] x = {1,2,3};        
		int[] y={1,3}; 
		// Output=2
		System.out.println("Output=" + countContain1(x,y));

		int[] a = {7,2,3};        
		int[] b = {1}; 
		// Output = 1
		System.out.println("Output=" + countContain1(a,b));

		int[] c = {3,2,4};        
		int[] d = {4,3,4};
		// Output = 0
		System.out.println("Output=" + countContain1(c,d));
		
	}
	
	public static int countContain1(int[] array1, int[] array2) {
		
		int counter1 = 0;
		
		if(array1[0]==1) {
			counter1++;
		}
		if(array2[0]==1) {
			counter1++;
		}
		
//		if(array1[0]==1 && array2[0]==1) {
//			counter1+=2;
//		}else if(array1[0]==1 || array2[0]==1) {
//			counter1++;
//		}
		
		return counter1;
		
	}

}
/*
Write a method that accepts two arrays and prints how many of the arrayshave 1 as their first element
int[] x = {1,2,3}        
Int[]y={1,3} 
Output=2

int[] x = {7,2,3}        
Int[] y = {1} 
Output = 1

int[] x = {3,2,4}        
Int[] y = {4,3,4} 
Output = 0
 */
