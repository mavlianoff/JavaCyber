package day35_Encapsulation;

public class CarpetTest {
	
	public static void main(String[] args) {
		
		//approach-1
		Floor f = new Floor(11,23);
		Carpet c = new Carpet(5.9);
		Calculator cal1 = new Calculator(f,c);
		System.out.println(cal1.getTotalCost());
		
		//approach-2
		Calculator cal2 = new Calculator(new Floor(11,23), new Carpet(5.9));
		System.out.println(cal2.getTotalCost());
		
	}
	
}
