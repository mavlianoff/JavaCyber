package day16_classObjects_1;

public class task_cellPhone {
	
	String brand;
	double screenSize;
	String color;
	double price;
	
	public void call() {
		System.out.println(brand + " calls");
	}
	
	public void message() {
		System.out.println(brand + " sends/receives messages");
	}
	
	public void takePhoto() {
		System.out.println(brand + " takes good photo");
	}

}
