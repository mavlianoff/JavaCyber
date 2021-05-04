package day27_Arrays_part4;

public class Lab4_Q3 {
	
	public static void main(String[] args) {
		
		int[] x = {1,2,3};
		int[] y = {7,3};
		
		int[] x1 = {1,2,3};
		int[] y1= {7,3,2};
		
		int[] x2 = {1,2,3};
		int[] y2= {1,3};
		
		int[] x3 = {1};
		int[] y3= {7,3};
		
		int[] x4 = {1,2,3};
		int[] y4= {1};
		
		System.out.println(compareArrays(x,y));
		System.out.println(compareArrays(x1,y1));
		System.out.println(compareArrays(x2,y2));
		System.out.println(compareArrays(x3,y3));
		System.out.println(compareArrays(x4,y4));
		
	}
	
	public static String compareArrays(int[] arr1, int[] arr2) {
		
		if(!(arr1.length>1)) {
			System.out.println("Array1 is not a valid array");;
		}
		if(!(arr2.length>1)) {
			System.out.println("Array2 is not a valid array");;
		}

		if(arr1[0]==arr2[0] || arr1[arr1.length-1] == arr2[arr2.length-1]) {
			return "true";
		}else {
			return "false";
		}
		
		
	}

}
		/*
		Write a method that accepts 2 arrays and checks the lengths of the arrays first.
		If lengths are more than 1, it prints true if the arrays have the same first element or they have the same last element.
		If the length of the array is not more than 1, it prints the "array1 is not a valid array " or "array2 is not a valid array"
		int[] x = {1,2,3};  = >true
		int[] y = {7,3};
		
		int[] x1 = {1,2,3}; = >false
		int[] y1= {7,3,2};
		
		int[] x2 = {1,2,3}; = > true
		int[] y2= {1,3};
		
		int[] x3 = {1}; = > Array1 is not valid
		int[] y3= {7,3};
		
		int[] x4 = {1,2,3}; = > Array2 is not valid
		int[] y4= {1};
		 */

