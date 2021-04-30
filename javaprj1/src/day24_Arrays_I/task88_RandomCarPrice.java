package day24_Arrays_I;

import java.util.Scanner;

import java.util.Random;

public class task88_RandomCarPrice {

	public static void main(String[] args) {
		/*
		•Create an array that holds cars (Honda, Toyota, Nissan, BMW, Mercedes, Porsche, Fe r ra r i )
		•Ask user to enter an index number to choose his dream car. 
		•Print the price for selected car.
		
		Car prices : 
			Honda –Toyota –Nissan (Random price between 20000 and 40000)
			BMW-Mercedes(Random price between 50000 and 80000)
			Porsche -Ferrari(Random price between 100000 and 150000)
		•Hint : finding a random number between 2 numbers = > ((max -min) + 1) + min
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter dream car index: ");
		int index = scan.nextInt();
		
		Random rn = new Random();
		int rnPriceHTN = rn.nextInt(2000 +1) + 2000;
		int rnPriceBM = rn.nextInt(3000+1)+5000;
		int rnPricePF = rn.nextInt(50000+1) + 100000;
		
		String[] cars = new String[7];
		cars[0] = "Honda";
		cars[1] = "Toyota";
		cars[2] = "Nissan";
		cars[3] = "BMW";
		cars[4] = "Mercedes";
		cars[5] = "Porsche";
		cars[6] = "Ferrari";

		if(cars[index].equals(cars[0]) || cars[index].equals(cars[1]) || cars[index].equals(cars[2])) {
			System.out.println("Price of your dream car (" +cars[index] + ") is: $" + rnPriceHTN);
		}else if(cars[index].equals(cars[3]) || cars[index].equals(cars[4])) {
			System.out.println("Price of your dream car (" +cars[index] + ") is: $" + rnPriceBM);
		}else if(cars[index].equals(cars[5]) || cars[index].equals(cars[6])) {
			System.out.println("Price of your dream car (" +cars[index] + ") is: $" + rnPricePF);
		}else {
			System.out.println("Invalid selection!");
		}
		
		//INSTRUCTOR SOLUTION:
		
		int price = 0;
		
		String selectedCar = cars[index];
		
		switch (selectedCar){
		case "Honda": case "Toyota": case "Nissan":
			price = rn.nextInt(2000 +1) + 2000;
			break;
		case "BMW": case "Mercedes":
			price = rn.nextInt(3000+1)+5000;
			break;
		case "Porsche": case "Ferrari":
			price = rn.nextInt(50000+1) + 100000;
			break;
		default:
			System.out.println("Invalid car!");
		}
		System.out.println("Price of your dream car is: $" + price);
	}

}
