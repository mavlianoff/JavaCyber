package day26_Array_part3;

import java.util.Arrays;

public class StringManipulationArray {
	
	public static void main(String[] args) {
		
		String[] myCars = {"Honda", "Mercedes", "BMW", "Toyota", " Ford  "};
		
		System.out.println(myCars[0].length());
		System.out.println(myCars[2].charAt(1));
		System.out.println(myCars[4].trim());
		System.out.println(myCars[1].substring(3, 8));
		System.out.println(myCars[1].equals(myCars[2]));
		
		for(int i=0; i < myCars.length; i++) {
			System.out.println(myCars[i].length());
		}
		
		
		//SPLIT
		
		String str = "It will display the array of the size";
		String[] strArray = str.split(" ");
		
		System.out.println("---------------------------------------");
		for(String array: strArray) {
			System.out.print(array + "-");
		}
		System.out.println("\n---------------------------------------");
		System.out.println(strArray.length);
		System.out.println(Arrays.toString(strArray));
		
		
		
	}

}
