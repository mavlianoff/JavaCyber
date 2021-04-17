package day15_methods_3;

public class task68_yearsUntilRetirement {

	public static void main(String[] args) {
		/*
		Write two methods:
		1-calculateAge(yearBirth); and returns the age
		2-yearsUntilRetirement(name,year); and displays in the console following: “Mike retires
		in 36 years”
		Example: yearsUntilRetirement(“Mike”,1990);
		 */
		
		yearsUntilRetirement("Sanzharbek", 1989);

	}
	
	public static int calculateAge(int yearBirth) {
		
		int yearCurrent=2021;
		int yearAge=yearCurrent-yearBirth;
		return yearAge;
	}
	
	public static void yearsUntilRetirement(String person, int year) {

		int retirementAge=60;
		int untilRetirement=retirementAge-calculateAge(year);
		System.out.println(person + " retires in " + untilRetirement + " years.");

	}

}
