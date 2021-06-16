package day40_AccessModifiers_Final_Hiding;

public class FinalVariables {
	
	//3 methods to initialize: 
		// 1 - traditional 
		// 2- constructor(){} 
		// 3- init block{}
	
//	public final int ROADSTER_MAX_RANGE;	//ERR, final keyword requires initialization
	public final int ROADSTER_MAX_RANGE= 600;
	public final int MODEL_3_MAXSPEED;		//ERR, initialize either here on in constructor
	public final int MODEL_X_PASSENGERS;
	public static final String ADMIN_USERNAME;	// where this variable will be initialized? in static block only
	
	public FinalVariables() {
		MODEL_3_MAXSPEED = 200;
//		ADMIN_USERNAME = "Mike"; 		// ERR?
								// constructor works only when we create object
								// static is not creating object but assign immediately in heap
								// static doenst care about object, runs once when class is loaded.
	}
	
	{
		MODEL_X_PASSENGERS = 7;
//		ADMIN_USERNAME = "Mike";	// instance runs whenever you create object before constructor
	}
	
	static {
		ADMIN_USERNAME = "Mike";
	}
	
	public static void main(String[] args) {
		
//		public final int MAX_PERSSENGERS_COUNT = 5	// local variable cannot have access modifiers
		final int MAX_PERSSENGERS_COUNT = 5;		// LOCAL, inside method(main)
		final int SNN;								// LOCAL, lets you initialize later, no immediate error as in class above
		SNN=66;
//		SNN++;	// ERR, cannot do chnage, it is final variable
		
		
		FinalVariables finalVars = new FinalVariables();
		System.out.println(finalVars.ROADSTER_MAX_RANGE);
		System.out.println(finalVars.MODEL_3_MAXSPEED);
		System.out.println(finalVars.ADMIN_USERNAME);
		System.out.println(ADMIN_USERNAME);			//same package same class - static direct access
		
		mA();										//same package same class - static direct access
		
	}
	public static void mA() {
	
	}
}
