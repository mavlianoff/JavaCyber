package day36_StaticClassMembers;

public class Countable {
	
//	int instanceCount;	// instance variable
	static int instanceCount;	// instance variable
	
	public Countable() {
		instanceCount++;
	}
	
	public int getInstanceCount() {
		return instanceCount;
	}
	
	
	
}
