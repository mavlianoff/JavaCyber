package day39_InheritanceReview_AccessModifiers;

public class Car extends Vehicle {
	
	private int wheels;
	private int doors;
	private int gears;
	private boolean isManual;
	private int currentGear;
	
	public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
//		super();					// there is constructor in parent with no paratemer whcih chained to another constructor for all parameters
		super(name, size);			// added String name and String size in above constructor to smoothly create object initiations while creating
		this.wheels = wheels;
		this.doors = doors;
		this.gears = gears;
		this.isManual = isManual;
		this.currentGear = 1;
	}
	
	public void changeGear(int currentGear) {
		this.currentGear = currentGear;
	}
	
	public void changeVelocity(int speed, int direction) {
		System.out.println("Car.changeVelocity(): Velocity " + speed + " direction " + direction);
//		move(speed, direction);	
		super.move(speed, direction);		// if you want to call move() from parent class
	}

	@Override											// checkpoint to make sure you are overriding same method with same parameters
	public void move(int velocity, int direction) {
		setCurrentDirection(direction +10);
		setCurrentVelocity(velocity +10);
		System.out.println("Vehicle.move(): Moving at " + getCurrentVelocity() + " in direction " + getCurrentDirection());
	}
	
	
	
	
	
	
	
	
	

}
