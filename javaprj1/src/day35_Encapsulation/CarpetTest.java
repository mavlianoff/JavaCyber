package day35_Encapsulation;

public class CarpetTest {
	
	public static void main(String[] args) {
		
		Floor f = new Floor(10,20);
		Carpet c = new Carpet(5);
		Calculator cal1 = new Calculator(f,c);
		System.out.println(cal1.getTotalCost());
		
		Calculator cal2 = new Calculator(new Floor(10,20), new Carpet(5));
		System.out.println(cal2.getTotalCost());
		
	}
	
}
