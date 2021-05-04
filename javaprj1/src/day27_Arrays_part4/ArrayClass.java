package day27_Arrays_part4;

import java.util.Arrays;

public class ArrayClass {
	
	public static void main(String[] args) {
		
		//toString()
		int[] nums = {43, 12, 4, 1, 3, 5};
		System.out.println(Arrays.toString(nums));  // [43, 12, 4, 1, 3, 5]
		
		
		//equals()
		int[] nums1 = {4,5,6,100};
		int[] nums2 = {4,5,6,100};
		System.out.println(Arrays.equals(nums1, nums2));
		
		
		//sort(): sorts array in ascending order
		
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		String[] languages = {"Zulu", "Spanish", "Italian", "English", "1Polish", "arabic", "@abc"};
		Arrays.sort(languages);
		System.out.println(Arrays.toString(languages));
		
		//binarySearch()
		int[] numX = {4,6,7,10,55};
		System.out.println(Arrays.binarySearch(numX, 7)); 	// 2 <- index
		System.out.println(Arrays.binarySearch(numX, 55)); 	// 4 <- index
		System.out.println(Arrays.binarySearch(numX, 5));	// -2          reason: (- (insertionPoint) - 1)
		System.out.println(Arrays.binarySearch(numX, 15));	// -5		   reason: (- (4) - 1)
		
		
	}

}
