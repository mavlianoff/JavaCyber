package day29_Arrays_part6;

public class Lab4_Q22 {
	
	public static void main(String[] args) {
		
		int[] x = {1,4,1};  		//= > true
		int[] xx = {1,4,1,4};  		//= > false
		int[] xxx = {1,1};  		//= > true
		
		count14(x);
		count14(xx);
		count14(xxx);
		
	}
	
	public static void count14(int[] array) {
		int counter1=0;
		int counter4=0;
		
		for(int i=0; i<array.length; i++) {
			if(array[i]==1) {
				counter1++;
			}else if(array[i]==4) {
				counter4++;
			}
			
		}
		if(counter1>counter4) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
	

}
/*
Write a method that accepts an array and prints true if the number 1's is greater than the number 4's
int[] x = {1,4,1}  = > true
int[] x = {1,4,1,4}  = > false
int[] x = {1,1}  = > true
 */
