package day40_AccessModifiers_Final_Hiding;

public class Mouse extends Rodent {

	protected int tailLength = 8;
	
	public void getMouseDetails() {
//		System.out.println("tail:" + tailLength + ", parentTail:" + tailLength);
		System.out.println("tail:" + tailLength + ", parentTail:" + super.tailLength);
	}
	
}
