package day38_Inheritance2;

public class StaticTest {
	
	public static void main(String[] args) {
		
		StaticSub obj = new StaticSub();
		obj.print();
		
		obj.num = 5;
		obj.print();
		
		StaticSuper.num = 10;
		obj.print();
//		System.out.println(StaticSuper.num);
		
//		StaticSub.m2();						//ERROR: m2 is not static therefore cannot call
		obj.m2();
		
		StaticSub.m1(); 					//NO ERROR: m1 is static therefore we can call it
		
		
		
	}

}
