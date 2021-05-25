package week9;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.addAll(Arrays.asList(1,1,1,1,1,2,2,2,3,3,3,3,4,4,4,5,5,6,7,8,9,6));
		
//		for(int i=0; i< list.size(); i++) {
//			if(list.get(i)<3) {
//				list.remove(i);
//			}
//		}
		// Above for loop will not work for collection objects
		// We have to apply ITERABLE to remove object from collection during iteration
		
		list.removeIf( each -> each<3 );
//		list.removeAll(Arrays.asList(3,4));				// removeAll used if we know concrete object(s) to be removed
		
		System.out.println(list);
		
		System.out.println("==================================");
		
		//TASK: remove countries with more than 10 characters
		
		String[] countryNames = {"United States of America", "United Kingdom", "Turkey", "Japan", "Korea", "Russia"};
		// Array cannot be removed therefore Arraylist will be needed to proceeed further
		ArrayList<String> countries = new ArrayList<>( Arrays.asList(countryNames));
		System.out.println(countries);
		
		countries.removeIf(p -> p.length() > 10); // if the length og the object is greater than 10, remove it from the ArrayList.
		System.out.println(countries);
		
		System.out.println("===================================");
		
		String[] jobTitles = {"SDET", "SDET", "QA", "QA", "BA", "PO", "SM", "DEV"};
		ArrayList<String> jobList = new ArrayList<>(Arrays.asList(jobTitles));
		
		jobList.retainAll(Arrays.asList("SDET", "QA"));								//REMOVES THAT ARE NOT "SDET", "QA"
//		jobList.removeIf(each -> !( each.equals("SDET") || each.equals("QA") ) );	//REMOVES THAT ARE NOT "SDET", "QA"
		
		System.out.println(jobList);
		
		
		
		
	}

}
