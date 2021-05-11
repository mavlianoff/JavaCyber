package week7;

import java.util.Arrays;

public class AddElementToArray_more {
	
	public static void main(String[] args) {
		
		int[] nums = {100, 200, 300, 400};
		// add 500 into array
		nums = addElement(nums, 500);
		System.out.println(Arrays.toString(nums));
		
		//add 600, 700 and 800 at once
		nums = addElement( addElement( addElement(nums, 600), 700), 800); //NESTED METHOD
		System.out.println(Arrays.toString(nums));
		
	}
	public static int[] addElement(int[] array, int element) {
		
		int[]newArray = new int[array.length + 1];
		
		int i=0;
		for(int each: array) {
			newArray[i++] = each;
		}
		
		newArray[i] = element;
		
		return newArray;	
	}


}
