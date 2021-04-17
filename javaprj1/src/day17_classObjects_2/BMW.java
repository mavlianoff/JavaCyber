package day17_classObjects_2;

public class BMW {
	
//	String make; // default is null
	String make="BMW"; // default is BMW
	String model;
	double price;
	
	public void showPrice() {
		
		switch(model) {
		case "330i":
			price=40250;
			break;
		case "740i":
			price=85000;
			break;
		case "m3":
			price=65000;
			break;
		default:
			System.out.println(model + " is not available");
			price=0.0;
		}
		System.out.println("Price: " + price);
	}

}
