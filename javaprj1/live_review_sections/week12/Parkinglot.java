package week12;

public class Parkinglot {
	
	public static void main(String[] args) {
	
		Toyota toyota = new Toyota("Camry", "White", 2021);
		BMW bmw = new BMW("X5", "Black", 2020);
		Tesla tesla = new Tesla("Model3", "Blue", 2019);
		
		toyota.start();
		bmw.start();
		tesla.start();
		
		System.out.println(toyota);
		System.out.println(bmw);
		System.out.println(tesla);
		
		
		
	}

}
