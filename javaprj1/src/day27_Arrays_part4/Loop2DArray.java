package day27_Arrays_part4;

public class Loop2DArray {
	
	public static void main(String[] args) {
		
		int[][] numbers = { {1,2,3}, {4,5}, {7,8,9} };
		
		//task: print each element
		for(int i=0; i < numbers.length; i++) {
			
			for(int j=0; j < numbers[i].length; j++) {
				
				System.out.print(numbers[i][j] + " ");
			}
			
		}
		
		
	}

}
