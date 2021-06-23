package day42_Interface;

public interface Electric {
	
	public static final boolean HAS_BATTERIES = true;
	
	boolean HAS_BATTERIES2 = false; 	// public final static
	
	//(1)//
	public abstract void charge();
	
	void charge2(); 						//public abstract  by default
	
	//(2)//
//	public void methodA() {					// interfaces cannot have instance method but (1) abstract (2) default (3) static
	public default void methodA() {
		//code
	}
	
	//(3)//
	public static void MethodB() {
		//code
	}

}
