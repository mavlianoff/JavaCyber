package day13_methods_1;

public class task61_AgeCalculator {

	public static void main(String[] args) {
		
		/*
		Write a method that accepts birthyear and displays the age in the console.
		Sample output:
		calculateAge(2000) -- > 18
		 */
		
		ageCalculator(2021, 1989);

	}
	
	public static void ageCalculator(int currentYear, int birthYear) {
		int age= currentYear-birthYear;
		System.out.println(age);
	}

}
