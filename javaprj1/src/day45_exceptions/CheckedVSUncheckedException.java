package day45_exceptions;

public class CheckedVSUncheckedException {
	
	public static void main(String[] args) {
		
//		Thread.sleep(2000); 				//2 ERR options: Import or Exception
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
