package day16_classObjects_1;

public class task_cellPhoneObjects {

	public static void main(String[] args) {
		
		task_cellPhone cellphone1 = new task_cellPhone();
		task_cellPhone cellphone2 = new task_cellPhone();
		task_cellPhone cellphone3 = new task_cellPhone();
		
		cellphone1.brand="iPhone 12";
		cellphone1.screenSize=4.68;
		cellphone1.color="Blue";
		cellphone1.price=490.99;
		
		System.out.println(cellphone1.brand);
		System.out.println(cellphone1.screenSize);
		System.out.println(cellphone1.color);
		System.out.println(cellphone1.price);
		
		cellphone1.brand="Nokia 6300";
		System.out.println(cellphone1.brand);
		
		cellphone1.call();
		cellphone1.message();
		cellphone1.takePhoto();

	}

}

//String brand;
//double screenSize;
//String color;
//double price;
//
//public void call() {
//	System.out.println(brand + " calls");
//}
//
//public void message() {
//	System.out.println(brand + " sends/receives messages");
//}
//
//public void takePhoto() {
//	System.out.println(brand + " takes good photo");
//}

