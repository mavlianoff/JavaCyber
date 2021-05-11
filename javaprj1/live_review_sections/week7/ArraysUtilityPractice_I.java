package week7;

import java.util.Arrays;

import utilities.ArraysUtility;

public class ArraysUtilityPractice_I {
	
	public static void main(String[] args) {
		
		String[] group1 = {"Bilan", "Kunduz", "Berk"};
		String[] group2 = {"Azat", "Serap", "Akhtam"};
		String[] group3 = {"Umit", "Nur", "Sema"};
		
		String[] names = ArraysUtility.merge(group1, group2);
		System.out.println(Arrays.toString(names));
		
		String[] allNames = merge(group1, group2, group3);
		System.out.println(Arrays.toString(allNames));
		
		
	}
	public static String[] merge(String[] arr1, String[] arr2, String[] arr3) {
		return ArraysUtility.merge(ArraysUtility.merge(arr1, arr2), arr3);
		
	}
}
