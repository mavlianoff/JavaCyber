package day29_Arrays_part6;

public class Lab4_Q24 {
	
	public static void main(String[] args) {
		
		int[] x = {1, 2, 1, 3};
		int a = 2;
		//Output:false
		System.out.println(intInArray(x,a));

		int[] xx = {1, 2, 1, 3};
		int b = 1;
		//Output:true
		System.out.println(intInArray(xx,b));
		
	}
	public static boolean intInArray(int[] array, int number) {
		for(int i=0; i<array.length-2; i++) {
			if(array[i]==number && (array[i+1]==number || array[i+2]==number)) {
				return true;
			}
		}
		return false;
	}

}
/*
A value is "everywhere" in an array if for every pair of adjacent elements in the array, at 
least one of the pair is that value.Write a method that accepts an array and a number, and prints true if the given number 
is everywhere in the array.
int[] x = {1, 2, 1, 3};
inta = 2;
Output:false

int[] x = {1, 2, 1, 3};
inta = 1;
Output:true
 */
