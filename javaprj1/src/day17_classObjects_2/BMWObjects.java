package day17_classObjects_2;

public class BMWObjects {

	public static void main(String[] args) {

		BMW b1 = new BMW();
		BMW b2 = new BMW();
		
		System.out.println(b1.make);
		System.out.println(b2.make);
		
		b1.make="BMW2021";
		System.out.println(b1.make);
		
		b1.model="m3";
		b1.showPrice();
		
		b2.model="X3";
		b2.showPrice();
		
		
		

	}

}
