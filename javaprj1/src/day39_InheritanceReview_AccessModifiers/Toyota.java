package day39_InheritanceReview_AccessModifiers;

public class Toyota extends Car{
	
	private int roadService;

//	public Toyota(String name, String size, int wheels, int doors, int gears, boolean isManual, int roadService) {
	public Toyota(int roadService) {
//		super(name, size, wheels, doors, gears, isManual);
		super("Toyota", "4WD", 4, 4, 6, false);		// since we hard coded, we can remove parameter initiation from constructor
		this.roadService = roadService;
	}
	
	public void accelerate(int rate) {
		
		int newVelocity = getCurrentVelocity() + rate;
		
		if(newVelocity == 0) {
			stop();
			changeGear(1);
		}else if(newVelocity > 0 && newVelocity <= 10) {
			changeGear(1);
		}else if(newVelocity > 10 && newVelocity <= 20) { 
			changeGear(2);
		}else if(newVelocity > 20 && newVelocity <= 30) {
			changeGear(3);
		}else {
			changeGear(4);
		}
		
		
		if(newVelocity>0) {
			changeVelocity(newVelocity, getCurrentDirection());
		}
		
		
		
	}
		
	
	
}
