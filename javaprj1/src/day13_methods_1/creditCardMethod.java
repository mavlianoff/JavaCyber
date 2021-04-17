package day13_methods_1;

public class creditCardMethod {

	public static void main(String[] args) {
		
		double salary=50000;
		int creditRating=5;
		
		if(salary>=20000 && creditRating>=7) {
			qualify();
		}else {
			noQualify();
		}	

	}

	public static void noQualify() {
		System.out.println("Sorry, not qualified for CC");
		
	}

	public static void qualify() {
		System.out.println("Congrats, you are qualified for CC");
		
	}
	
	

}
