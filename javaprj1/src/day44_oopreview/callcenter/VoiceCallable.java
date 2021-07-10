package day44_oopreview.callcenter;

public interface VoiceCallable {
	
	boolean CAN_CALL = true; //public static final boolean CAN_CALL=true;
	
	//abstract method
	void call(String contact); //public abstract void call(String contact)
	
	//static method 
	public static void decline(){
		System.out.println("Mike declined voice call..");
	}
	
	//default method
	public default void accept() {
		System.out.println("Mike finally accepted voice call..");
	}

}

//Abstract can have variables? any kind, static or instance
//interface can have variables? only static final(1) variables

//final variable instantiate: (1)same line (2)constructor (3)instance block