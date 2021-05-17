package week8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice4 {
	
	public static void main(String[] args) {
		
		ArrayList<Character> list = new ArrayList<>();
		list.addAll( Arrays.asList('D', 'A', 'A', 'B', 'C', 'A') );  //converted primitive char to ArrayList
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.swap(list, 0, list.size()-1); //WORKS
//		Collections.swap(list, list.size()-1, 0); //WORKS
		System.out.println(list);
		
		Collections.replaceAll(list, 'A', 'E');
		System.out.println(list);
		
		int frequencyOfE = Collections.frequency(list, 'E');
		System.out.println(frequencyOfE);
		
		System.out.println("=====================");
		
		//TASK: finding unique elements
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.addAll( Arrays.asList(1,2,3,6,4,5,6,3,5,5,3,1,5,7,2,7));
		
		for(Integer each: numbers) {
			if( Collections.frequency(numbers, each) == 1 ) {
				System.out.println(each);
			}
		}
		
		System.out.println("=====================");
		
		//TASK: finding unique characters:
		String str = "aabccd";
		
//		str.split(""); 					-----> splitting string into characters
		ArrayList<String> chars = new ArrayList<>( Arrays.asList(str.split("")) );
//		System.out.println(chars);
		
		String unique = "";
		for(String each: chars) {
			int f = Collections.frequency(chars, each);
			if(f == 1) {
				unique+=each;
			}
		}
		System.out.println(unique);
		
		System.out.println("=====================");
		
		String s = "aabbbcccc";
		String result = ""; 		//a2b3c4
		
//		s.split(""); //String --> Array
		ArrayList<String> characters = new ArrayList<>( Arrays.asList(s.split("")) );
		for(String each: characters) {
			int f = Collections.frequency(characters, each);
			if( !result.contains(each) ) {
				result += each + f;
			}
		}
		System.out.println(result);
		
		
		
	}

}
