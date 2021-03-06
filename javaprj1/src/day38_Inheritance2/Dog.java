package day38_Inheritance2;

public class Dog extends Animal{
	//IMPORTANT:  if extension gives error: CHECK constructor calling first!
	
	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;
	
	public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int teeth,
			String coat) {
		super(name, brain, body, size, weight);
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
	}
	
	public void chew() {
		System.out.println("Dow.chew() is called");
	}

	@Override
	public void eat() {
		System.out.println("Dog.eat() is called");
		chew();
		super.eat();
	}
	
	public void walk() {
		System.out.println("Dog.walk() is called");
		move(5);
	}
	
	public void run() {
		System.out.println("Dog.run() is called");
		move(10);
	}

	@Override
	public void move(int speed) {
		System.out.println("Dog.move() is called");
		moveLegs(speed);
		super.move(speed);
	}
	
	public void moveLegs(int speed) {
		System.out.println("Dog.moveLegs() is called");
	}
	
	
	
	
	
	
	

}
