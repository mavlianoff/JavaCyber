package week6;

import java.util.Arrays;

public class ArraysPractice3 {
	
	public static void main(String[] args) {
		
		char[][] arr2D = { {'A', 'B', 'C'}, {'D', 'E'}, {'F', 'G', 'H', 'I'} };
		
		for(char[] eachGroup: arr2D) {
//			System.out.println(Arrays.toString(eachGroup));
			for(char eachCh: eachGroup) {
				System.out.println(eachCh);
			}
		}
		
		System.out.println("=======3D ARRAYS========");
		int[][] arr2D_1 = { {1,2}, {3,4,5} };
		int[][] arr2D_2 = { {6,7,8,9,10}, {11,12,13} };
		
		int[][][] arr3D = { { {1,2}, {3,4,5} } ,  { {6,7,8,9,10}, {11,12,13} }  };
		System.out.println(Arrays.deepToString(arr3D));
		System.out.println(Arrays.deepToString(arr3D[1]));
		System.out.println(Arrays.toString(arr3D[1][0]));
		System.out.println(arr3D[1][0][2]);
		
		for(int[][] each2D: arr3D) {
			for(int[] each1D: each2D) {
				for(int each: each1D) {
					System.out.print(each + " ");
				}
			}
		}
		
		System.out.println("\n\n=======4D ARRAYS========");
		int[][][][] arr4D = {      { { {1,2}, {3,4,5} } ,  { {6,7,8,9,10}, {11,12,13} }  },
							 { { {10,20}, {30,40,50} } ,  { {60,70,80,90,100}, {110,120,130} }  }   };
		
		for(int[][][] each3D: arr4D) {
			for(int[][] each2D: each3D) {
				for(int[] each1D: each2D) {
					for(int each: each1D) {
						System.out.print(each + " ");
					}
				}
			}
		}
		
		
		
		
		
		
	}

}
