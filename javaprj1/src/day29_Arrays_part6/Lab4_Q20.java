package day29_Arrays_part6;

public class Lab4_Q20 {
	
	public static void main(String[] args) {
		
		int[] x = {1,2,2};		// = > true
		int[] y = {1, 2, 1,2};	//  = > false
		int[] a = {2,1,2};		// = > false
		int[] b = {2,2,1,2};	// = > true
		
		isContain2(x);
		isContain2(y);
		isContain2(a);
		isContain2(b);

	}
	
	public static void isContain2(int[] array) {
		
//		for(int i=0; i<array.length-1; i++) {
//			if(array[i]==2 && array[i+1]==2) {
//				return true;
//			}
//		}
//		return false;
		
		boolean flag=false;
		
		for(int i=0; i<array.length-1; i++) {
			if(array[i]==2 && array[i+1]==2) {
				flag=true;
				break;
			}
		}
		
		
		if(flag) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}

}
/*
Write a method that accepts an array and prints true if the array contains a 2 next to a 2 somewhere.
int[] x = {1,2,2} = > true
int[] y = {1, 2, 1,2}  = > false
int[] a = {2,1,2} = > false
int[] b = {2,2,1,2} = > true
 */
