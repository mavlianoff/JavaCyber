package day42_Interface;

public class TeslaSemi extends ElectricTruck{
	
	private double engineSize;

	//CONSTRUCTORS
	
	public TeslaSemi(String model, double price, String color, double engineSize) {
		super(model, price, color);
		this.engineSize = engineSize;

	}

	//METHODS											//CONCRETE CLASS MUST NOT OVERRRIDE METHODS
	
	@Override
	public void load(String item) {
		System.out.println("TeslaSemi - load" + item + " by lowering the truck and opening door...");
		
	}

	@Override
	public void start() {
		System.out.println("TeslaSemi - start truck by pressing a button...");
		
	}

	@Override
	public void charge() {
		System.out.println("TeslaSemi - plugin charge for 30 mins...");
		
	}

	@Override
	public void driver() {
		System.out.println("TeslaSemi - truck is driving with load...");
		
	}

	//GETTERS AND SETTERS
	
	public double getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
	}
	
	

}
