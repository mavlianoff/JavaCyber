package day36_StaticClassMembers;

public class ABCTest {
	
	public static void main(String[] args) {
		
		//TASK: with slight twist in class, please make line 11-12 invalid
		
		ABC.m1();
		
//		ABC o1 = new ABC();				
//		o1.m1();
		
		//TAKEAWAY: When you want to call method ONLY through static way( ABC.m1() ), you should create a 'private' constructor
		// line 11 is calling constructor, by nature, and that constructor is private therefore error in line11
		
	}
	
	public static void print() {
		int a = 5;			// local variable
//		static int a = 5;	// local variables CANNOT be static
	}

}
