package assignments.ArithmeticOperators;

public class question5 {

	public static void main(String[] args) {
		/*
		
		Write a program that outputs the number of hours, minutes, and seconds that corresponds to input total seconds.

		-Declare int variables inputSeconds, hours, minutes, seconds
		-Initialize the inputSeconds
		
		-Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
		-Assign values to the hours, minutes, seconds variables
		-Display the result
		
		       Sample Output:
		
		       inputSecond is 3695
		
		      1 hours, 1 minutes, and 35 seconds
				
		 */
		
//		final int minPerHour= 60;
//	    final int secPerMin = 60;
	    int inputSeconds = 3695;	   
//	    
//	    int seconds = inputSeconds % secPerMin;
//	    int totalMinutes = inputSeconds / secPerMin;	    
//	    int minutes = totalMinutes % minPerHour;
//	    int hours = totalMinutes / minPerHour;	  
//
//	    System.out.println("inputSecond is " + inputSeconds);
//	    System.out.println(hours + " hour(s) " + minutes + " minute(s) " + seconds + " second(s)");	
	    
	    // SOLUTION MAIN:
	    
//		import java.util.*;
		
//		Scanner scan=new Scanner(System.in);
//	    System.out.println("Enter seconds:");
//	    int inputSeconds=scan.nextInt();

	    int hours=inputSeconds/60/60; 			// whole hours
	    int hoursRemainder=inputSeconds%360; 	//remaninder total seconds
	    int minutes=hoursRemainder/60; 			// whole minutes
	    int minutesRemainder=hoursRemainder%60;
	    int seconds=minutesRemainder;
	 
	    System.out.println(hours+ " hours " + minutes + " minutes " + seconds + " seconds ");

	}

}
