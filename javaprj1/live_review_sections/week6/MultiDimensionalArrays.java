package week6;

import java.util.Arrays;

public class MultiDimensionalArrays {
	
	public static void main(String[] args) {
		
		// n dimensional arrays contains (n-1) dimensional array
		// 2 dimensional arrays contains ( 1 ) dimensional array
		
		int[] arr = {10, 20};
		int[][] arr2D = { {10, 20}, {40, 60}, {100, 120, 130} };
						//    0         1            2             ==> array index
		                //  0   1     0   1     0    1    2		   ==> element index
		System.out.println(arr2D.length); // 3: as it contains 3 1D arrays
		
		System.out.println(Arrays.deepToString(arr2D));
		System.out.println(Arrays.toString(arr2D[2])); // getting array
		System.out.println(arr2D[2][2]); 			   // getting element
		
		System.out.println("===================================");
		
		String[] group1 = {"Serap", "Ahmet"};
		String[] group2 = {"Bunyamin", "Neziha"};
		String[] group3 = {"Rustem", "Harun"};
		
		String[][] groups = {{"Serap", "Ahmet"}, {"Bunyamin", "Neziha"}, {"Rustem", "Harun"}};
		//print Rustem
		System.out.println(groups[2][0]);
		
		System.out.println("\n====== PRINT EACH GROUP - MANUAL=====");
		System.out.println(Arrays.toString(groups[0]));
		System.out.println(Arrays.toString(groups[1]));
		System.out.println(Arrays.toString(groups[2]));
		System.out.println("\n=======PRINT 2D ARRAY=======");
		System.out.println(Arrays.deepToString(groups));
		
		System.out.println("\n=======PRINT EACH GROUP - FOR EACH LOOP=======");
		for(String[] each: groups) {
			System.out.println(Arrays.toString(each));
		}
		for(int i=0; i<groups.length; i++) {
			String[] eachGroup = groups[i];
			System.out.println(Arrays.toString(eachGroup));
		}
		

		System.out.println("\n========PRINT EACH MEMBER - FOR LOOP===========");
		for(int i=0; i<groups.length; i++) {
			for(int j=0; j< group1.length; j++) {
				System.out.print(groups[i][j] + " ");
			}
		}
		
		System.out.println("\n========INSTRUCTOR'S SOLUTION===========");
		for(int i=0; i<groups.length; i++) {
			String[] eachGroup = groups[i];
			System.out.println(Arrays.toString(eachGroup));
			
			for(int j=0; j<eachGroup.length; j++) {
				String eachMember = eachGroup[j];
				System.out.println(eachMember);
			}
			
		}
		
		
	}

}
