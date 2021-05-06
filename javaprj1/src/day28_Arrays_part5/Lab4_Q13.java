package day28_Arrays_part5;

import java.util.Arrays;

public class Lab4_Q13 {
	
	public static void main(String[] args) {
		
		int[] x = {1,2};    
		int[] y = {3,4};  
		//Result = > [3,4]
		
		int[] zz = {5,6};    
		int[] zy = {3,8};
		//Result = > equal 
				
		int[] zx = {1,1};    
		int[] yz = {1,0};  
		//Result = > [1,1]
		
		largestArray(x,y);
		largestArray(zz,zy);
		largestArray(zx,yz);
		
	}
	
	public static void largestArray(int[] arr1, int[] arr2) {
		
		int sumArr1=0;
		int sumArr2=0;
		for(int i=0; i<arr1.length; i++) {
			sumArr1+=arr1[i];
			sumArr2+=arr2[i];
		}
		
		if(sumArr1>sumArr2) {
			System.out.println(Arrays.toString(arr1));
		}else if(sumArr1<sumArr2) {
			System.out.println(Arrays.toString(arr2));
		}else {
			System.out.println("equal");
		}
				
	}

}
/*
Write a method that accepts 2 arrays and consider the sum of the values in each array.
Print the array which has the largest sum. In event of a tie, print "equal"
int[] x = {1,2}    int[] y = {3,4}  = > [3,4]
int[] x = {5,6}    int[] y = {3,8}  = > equal 
int[] x = {1,1}    int[] y = {1,0}  = > [1,1]
 */
