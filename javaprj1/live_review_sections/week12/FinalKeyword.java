package week12;

//class Test extends String{							// ERR, String is (built-in) final class therefore it cannot be parent class
class Test{	
	protected final void method() {
		System.out.println("Good Morning");
	}
}

public class FinalKeyword extends Test {
	
//	@Override
//	public void method() {						// ERR, cannot override from final method() from Test class
//		System.out.println("Good Evening");
//	}
	
	
	final int b;						//ERR, final (instance) variable must be initialized (constructor)
	final static int c;					//ERR, final (instance) variable must be initialized (statuc block)
	
	//initializing: instance variables by constructor
	public FinalKeyword(int b) {
		this.b = b;
	}
	//initializing: static variables by static block
	static {
		c=200;
	}
	
	public static void main(String[] args) {
		final int a;					//NO ERR, final (local) variable can be initialized later
//		System.out.println(a);			//however, using without initializing final (local) variable gives ERR
		
		a = 100;
//		a = 200;						//ERR, final variable cannot be re-assigned
		System.out.println(a);

		//Examples of final keyword usage
		final String DATE_OF_BIRTH = "May/20/1990";
		final char gender = 'M';
		int min = Integer.MIN_VALUE; 		// note that capital letters are reserved for final keyword, check with CTRL+Click
		
		
		
		
		
	}

}
