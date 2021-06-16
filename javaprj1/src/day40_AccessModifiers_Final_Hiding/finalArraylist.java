package day40_AccessModifiers_Final_Hiding;

import java.util.ArrayList;

public class finalArraylist {
	
	public static void main(String[] args) {
		
		final ArrayList<String> COLORS = new ArrayList<>();
		
		COLORS.add("Orange");
		COLORS.add("Red");
		COLORS.remove(0);
		
//		COLORS = new ArrayList<String>(); //ERR, you cannot change the reference when itis declared final
		
		
	}

}
