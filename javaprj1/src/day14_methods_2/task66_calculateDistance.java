package day14_methods_2;

public class task66_calculateDistance {

	public static void main(String[] args) {

		/*
		The distance a vehicle travels can be calculated as follows:
		Distance = Speed * Time
		Write a method named distance that accepts a vehicle’s speed and time as arguments,
		and return the distance the vehicle has traveled.
		 */
		
//		calculateDistance(60, 5);
		double distanceTravelled=calculateDistance(60,5);
		System.out.println("Returned: " + distanceTravelled);

	}
	
	public static double calculateDistance(double Speed, int Time) {
		double Distance=Speed * Time;
		System.out.println("Locally: " + Distance);
		
		return Distance;
		
	}

}
