package week7;

import java.util.Arrays;

public class ArrayReview {
	
	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,5,6,7,8,9,10};
		int[] arr2 = {11,12,13,14,15,16,17,18,19,20};
		
//		int[] arr3 = new int[arr1.length + arr2.length];
//		//System.out.println(Arrays.toString(arr3)); // [0,0,0,0,0,0,0]
//		
//		int i=0;
//		
//		for(int each: arr1) {
//			arr3[i++] = each;  //IMPORTANT: POST-INCREMENT
//		}
//		//System.out.println(i);
//		
//		for(int each: arr2) {
//			arr3[i++] = each;  //IMPORTANT: POST-INCREMENT
//		}
//		//System.out.println(i);
//		
//		System.out.println(Arrays.toString(arr1));
//		System.out.println(Arrays.toString(arr2));
//		System.out.println(Arrays.toString(arr3));
		
		System.out.println(Arrays.toString(merge(arr1, arr2)));
		
		
	}
	
	public static int[] merge(int[] arr1, int[] arr2) {
		
		int[] arr3 = new int[arr1.length + arr2.length];
		//System.out.println(Arrays.toString(arr3)); // [0,0,0,0,0,0,0]
		
		int i=0;
		
		for(int each: arr1) {
			arr3[i++] = each;  //IMPORTANT: POST-INCREMENT
		}
		//System.out.println(i);
		
		for(int each: arr2) {
			arr3[i++] = each;  //IMPORTANT: POST-INCREMENT
		}
		//System.out.println(i);
		
		return arr3;
		
	}

}
