package day36_StaticClassMembers;

public class CountableTest {
	
	public static void main(String[] args) {
		
		int objectCount;
		
		Countable obj1 = new Countable(); //objectCount=1
		Countable obj2 = new Countable(); //objectCount=2
		Countable obj3 = new Countable(); //objectCount=3
		
		objectCount = obj1.getInstanceCount();
		objectCount = obj2.getInstanceCount();
		
		System.out.println(objectCount);
		
		System.out.println(Countable.instanceCount);
	}

}
