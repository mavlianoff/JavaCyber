package utilities;

public class ArraysUtility {
	
	//returns the maximum number for int data
	public static int max(int[] array) {
		
		int max = array[0];
		for(int i=0; i<array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
				
		}
		return max;
	}
	
	//returns the maximum number for double data
	public static double max(double[] array) {
		
		double max = array[0];
		for(int i=0; i<array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
				
		}
		return max;
	}	
		
		
		
	//returns the mimimum number for int data
		public static int min(int[] array) {
			
			int min = array[0];
			for(int i=0; i<array.length; i++) {
				if(array[i] < min) {
					min = array[i];
				}
					
			}
			return min;
		}
		
		//returns the minimum number for double data
		public static double min(double[] array) {
			
			double min = array[0];
			for(int i=0; i<array.length; i++) {
				if(array[i] < min) {
					min = array[i];
				}
					
			}
			return min;
		
	}	
}
