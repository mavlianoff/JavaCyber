package day42_Interface;

public class ElectricCarTest {
	
	public static void main(String[] args) {
		
//		ElectricCar ec = new ElectricCar();	//ERR, abstract class, cannot create object
		
		Tesla modelS = new Tesla("Model S", 45000, "Grey");
		modelS.charge();
		modelS.start();
		modelS.driver();
		modelS.stop();
		
		System.out.println("===============================");
		
		Ford fusion = new Ford("Fusion", 35000, "Black", 2017);
		fusion.charge();
		fusion.start();
		fusion.driver();
		fusion.stop();
		
		System.out.println("================================");
		
		TeslaSemi semi = new TeslaSemi("Semi", 50000, "Brown", 3.5);
		semi.charge();
		semi.start();
		semi.load("Oranges");
		semi.driver();
		semi.stop();
		
		System.out.println("================================");
		
		TeslaTruck tr = new TeslaTruck("CybertekTruck", 100000, "White", 6.0);
		tr.charge();
		tr.start();
		tr.load("Java books");
		tr.driver();
		tr.stop();
		
		System.out.println("=================================");
		
		System.out.println(modelS.toString());
		System.out.println(fusion.toString());
		System.out.println(tr.toString());
		
	}

}
