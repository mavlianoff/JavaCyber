package day13_methods_1;

public class task59_showPay {

	public static void main(String[] args) {

		/*
		Write a method that accepts number of hours and hourly pay and show your pay for those hours in the console.
		 */
		
		showHourlyPay(45, 25.59);

	}
	
	public static void showHourlyPay(int hour, double hourlyPay) {
		double pay=hour*hourlyPay;
		System.out.println("Your weekly pay is: USD " + pay);
	}

}
