package day10_controlFlowStatements_4;

public class task44_KPGtoMPG {

	public static void main(String[] args) {
		/*
		Your friend Mike Smith just inherited a European sports car from his uncle. Mike lives in
		the USA, and he is afraid he will get a speeding ticket because the car’s speedometer
		indicates kilometers per hour(KPH). He has asked you to write a program that displays a
		table of speeds in kilometers per hour with their values converted to miles per
		hour(MPH). The formula for converting KPH to MPH is:	
		MPH = KPH * 0.6214
		The table that your program displays should show speeds from 60 kilometers per hour
		thru 130 kilometers per hour, in increments of 10, along with their values converted to
		miles per hour. The table should look like something like this: (table)
		 */
		
		
		System.out.println("KPM        MPG");
		System.out.println("***************");
		
		for (int i=60; i<=130; i+=10) {
			System.out.println(i + "\t" + (i*0.6214));
		}
		
		System.out.println("***************");

		
		
		System.out.println("KPM\tMPG");
		System.out.println("***************");
		
		//variables:
		int kph;
		double mph;
				
		//constants:
		final int STARTING_KPH=60;
		final int MAX_KPH=130;
		final int INCREMENT=10;
		
		for(kph=STARTING_KPH; kph<=MAX_KPH; kph+=INCREMENT) {
			mph=kph*0.6214;
			System.out.println(kph + "\t" + mph);
		}
		
		System.out.println("***************");
	
	
	
	}

}
