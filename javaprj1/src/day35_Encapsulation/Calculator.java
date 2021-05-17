package day35_Encapsulation;

public class Calculator {

	Floor floor;		// just declaring but not doing initialization therefore no 'new Floor()' part
	Carpet carpet;
	

	public Calculator(Floor floor, Carpet carpet) {
		this.floor = floor;
		this.carpet = carpet;
	}


	public double getTotalCost() {
		return carpet.getCost() * floor.getArea();
	}
	
}
