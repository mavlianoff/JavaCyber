package day15_methods_3;

public class task71_calcFeetAndInchesToCentimeters {

	public static void main(String[] args) {

		// 1 inch = 2.54 cm
		// 1 feet = 12 inches
		calcFeetAndInchesToCentimeters(100);

	}
	
	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		if(feet<0 || (inches<0 || inches>12)) {
			return -1;
		}
		
		double centimeters=(feet*12)*2.54 + (inches*2.54);
		System.out.println(feet + " feet," + inches + " inches=" + centimeters + " centimeters");
		
		return centimeters;
		
	}
	
	public static double calcFeetAndInchesToCentimeters(double inches) {
		if(inches<0) {
			return -1;
		}
		
		double feet=(int) inches/12;   // to cast 8.3333333 to 8.0
		double remainingInches=inches%12;
		System.out.println(inches + " inches " + feet + " feet and " + remainingInches + " inches");
		return calcFeetAndInchesToCentimeters(feet, remainingInches);
		
		
	}
}
