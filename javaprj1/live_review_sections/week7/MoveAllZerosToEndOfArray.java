package week7;

import java.util.Arrays;

public class MoveAllZerosToEndOfArray {
	
	public static void main(String[] args) {
		
		int[] array = {1,0,2,0,3,0,0,4,5,6,7};
		System.out.println(Arrays.toString(array));
		
		int[] newArray = new int [array.length];
		
		//SOLUTION-1
		int i = 0;
		for(int each: array) {
			if(each !=0) {
				 newArray[i++]= each;
			}
		}
		System.out.println(Arrays.toString(newArray));
		
		//SOLUTION-2
//		for(int i=0, j=0; i < array.length; i++) {
//			if(array[i] != 0) {
//				newArray[j++] = array[i];
//			}
//		}
//		System.out.println(Arrays.toString(newArray));
		

	}
	
}

/*
Move all zeros to the end of array
array = {1,0,2,0,3,0,0,4,5,6,7}
output = {1,2,3,4,5,6,7,0,0,0,0}
 */
