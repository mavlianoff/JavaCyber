package day40_AccessModifiers_Final_Hiding;

public class Kangaroo extends Marsupial{

	@Override
	public boolean isBiped() {
		return true;
	}
	
	public void getKangarooDescription() {
		System.out.println("Kangaroo hops on two legs:" + isBiped());
	}
	
}
