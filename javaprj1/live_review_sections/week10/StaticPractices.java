package week10;

import java.util.ArrayList;

public class StaticPractices {
	
	String name;								// object instance
	static int b;
	
	public static void printName() {		// static = zero-object instances, method does not involve using instance members
//		System.out.println(name);					// error: due to no object instances
//		System.out.println(this.name);				// error: still refers to object instances
		
		System.out.println( new StaticPractices().name ); 	// only thorugh creating object you can print name under static
	}
	
	
	public void printName2() {				// not as picky as static, instances can accept statis members too
		System.out.println(name);			// ok: instance variable
		System.out.println(b);				// ok: instances can accept static too
	}
	
	
	//======================================//==========================================//============================
	
	static String str = "Word";			// single code line to create therefore code block is not needed
	
	static ArrayList<String> names;		// several code lines to create therefore code block is needed
	static {							// static block is needed is more than one step is needed to initialize your static variable
		names = new ArrayList<>();
		names.add("Muhtar");
	}
										// IMPORTANT DIFFERENCE:
											// IF, static variable, initialize static code block ==> see above
											// IF, instance variable, initialize with constructor always ==> see below
	String name2;
	public StaticPractices() {
		this.name = name;
	}
	
	//======================================//==========================================//============================
	
	static class Hello{				// onyl inner classes can be static
		
	}
	
	
	

}
