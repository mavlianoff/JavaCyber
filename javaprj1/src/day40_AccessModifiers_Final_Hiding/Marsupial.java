package day40_AccessModifiers_Final_Hiding;

public class Marsupial {
	
	public boolean isBiped() {
		return false;
	}
	
	public void getMarsupialDescription() {
		System.out.println("Marsupial walks on the two legs:" + isBiped());
	}
	

}
