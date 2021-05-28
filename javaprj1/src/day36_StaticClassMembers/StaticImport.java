package day36_StaticClassMembers;

import static java.lang.Math.*;					// import all static properties belong to Match class

public class StaticImport {
	
	public static void main(String[] args) {
		
		System.out.println(Math.sqrt(16));
		
		
		System.out.println(sqrt(16));			//will work only when import static
		
		System.out.println(PI);					//will work only when import static
		
		
	}
	

}
