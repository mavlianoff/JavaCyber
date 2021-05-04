package day24_Arrays_part1;

public class task90_CarHonda {

	public static void main(String[] args) {
		/*
		ØCreate a car array that holds 6 car names inside
		ØCheck if your array has the car name “Honda”
		ØIf it is , print “ I found your car Honda in this array”
		ØIf it is not, print “ I could not find your car Honda in this array”
		 */
		
		String[] cars = {"BMW", "Toyota", "Nissan", "VW", "Mercedes", "Honda"};
		
		boolean flag = false;
		
		for(int i = 0; i < cars.length; i++) {
			if(cars[i].equalsIgnoreCase("Honda")) {
				flag=true;
				break;
			}
		}
		
		if(flag) {
			System.out.println("I found your car Honda in this array");
		}else {
			System.out.println("I could not find your car Honda in this array");
			
		}

	}
}
