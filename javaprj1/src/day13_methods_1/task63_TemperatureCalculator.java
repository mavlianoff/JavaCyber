package day13_methods_1;

public class task63_TemperatureCalculator {

	public static void main(String[] args) {
		
		/*
		Write a function that accepts Fahrenheit and displays the Celcius in the console.
		Sample Output:
		calculateCelcius(32) -- > 0
		calculateCelcius(50) --> 10
		 */
		
		tempCalculator(32);
		tempCalculator(50);

	}
	
	public static void tempCalculator(int Fahrenheit) {
		//Formula = (°F - 32) x .5556
		
		int Celcius=0;
		
		Celcius = (int)((Fahrenheit - 32)*0.5556); 
		System.out.println("Celsius: " + Celcius);
	}

}
