package week7;

import java.util.Arrays;

import utilities.ArraysUtility;

public class ArraysUtilityPractice_II {
	
	public static void main(String[] args) {
		
		int[] numbers = {10, 5, 4, 3, 20, 50, 60, 70, 0, 100};
		
		//TASK: sort array in descending order
		
		Arrays.sort(numbers); // Java built-in method
		System.out.println(Arrays.toString(numbers));
		
		numbers = ArraysUtility.reverse(numbers);
		System.out.println(Arrays.toString(numbers));
		
		System.out.println("---------------------------------");
		
		String[] group = {"Ugur", "Burak"};
		String student1 = "Ferhat";
		String student2 = "Ahmet";
		String student3 = "Bunyamin";
		
		group = ArraysUtility.addElement( ArraysUtility.addElement( ArraysUtility.addElement(group, student1), student2), student3);
		
		System.out.println(Arrays.toString(group));
		
		
		
		
	}

}
