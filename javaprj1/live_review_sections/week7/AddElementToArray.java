package week7;

import java.util.Arrays;

public class AddElementToArray {
	
	public static void main(String[] args) {
		
		int[] numbers = {1,2,3};
		int element = 4;
		
		numbers = addElement(numbers, element);
		
		System.out.println(Arrays.toString(numbers));

		
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
