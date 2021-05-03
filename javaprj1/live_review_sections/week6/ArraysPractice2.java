package week6;

import java.util.Arrays;

public class ArraysPractice2 {
	
	public static void main(String[] args) {
		
		String str = "I love Java";
		String[] arr = str.split(" ");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("----------------------");
		
		//task: reverse below sentence as Saturday is Today
		String sentence = "Today is Saturday";
		String result = "";
		String[] words = sentence.split(" "); //[Today, is, Saturday]
		
		for(int i=words.length-1; i>=0; i--) {
			result+=words[i] + " ";
		}
		result = result.trim();
		System.out.println(result);
		
		System.out.println("----------------------");
		
		String school = "Cybertek School";
		char[] letters = school.toCharArray();
		System.out.println(Arrays.toString(letters));
		
		System.out.println("----------------------");
		
		String[] names = {"Sergiu", "Serap", "Aysenur", "Aiden"};
		System.out.println(Arrays.toString(names));
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		int[] nums = {2, 6, 7, 3, 4, 1, 5};
		Arrays.sort(nums); 					// Ascending order
		System.out.println(Arrays.toString(nums));
		
		System.out.println("----------------------");
		
		// equals method
		int[] arr1 = {1,2,3};
		int[] arr2 = {1,2,3};
		int[] arr3 = {3,1,2};
		
		System.out.println(arr1 == arr2); 				// false: two different objects
		System.out.println(Arrays.equals(arr1, arr2)); 	// true: compare index by index
		System.out.println(Arrays.equals(arr2, arr3));  // false: compare index by index, sorting needed!
		
		Arrays.sort(arr2);
		Arrays.sort(arr3);
		
		System.out.println(Arrays.equals(arr2, arr3));   // true: compare index by index
		
		
		System.out.println("----------------------");
		
		// task: ANAGRAM
		
		String s1 = "listen";
		String s2 = "silent";
		
		char[] s1char = s1.toCharArray();
		char[] s2char = s2.toCharArray();
		
		boolean isAnagram = Arrays.equals(s1char, s2char);
		System.out.println(isAnagram);
		
		Arrays.sort(s1char);
		Arrays.sort(s2char);
		
		System.out.println(Arrays.toString(s1char));
		System.out.println(Arrays.toString(s1char));	
		
		if(Arrays.equals(s1char, s2char)) {
			System.out.println("ANAGRAM");
		}else {
			System.out.println("NOT anagram");
		}
		
		
		System.out.println("----------------------");
		
		
		
		
		
		
		
		
		
		
	}

}
