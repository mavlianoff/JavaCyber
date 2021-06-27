package day43_Polymorphism;

public class AppleStore {
	
	public static void main(String[] args) {
		
		AppleDevice mac = new Mac();
		mac.use();
//		mac.code();		//ERR, no available. IMPORTANT: Reference Type decides: does AppleDevice have overriden code() method?
		
		Mac myMac = new Mac();
		myMac.use();
		myMac.code();	// NO ERR
		
		AppleDevice watch = new AppleWatch();
		watch.use();
		
		
		
		
	}

}
