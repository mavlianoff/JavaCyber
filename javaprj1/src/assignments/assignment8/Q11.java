package assignments.assignment8;

public class Q11 {

	public static void main(String[] args) {
		
		/*
		c_profits gets the buyPrice(int) and sellPrice(int) and determines if there was a profit or loss.
		it returns a string value that can be "profit","loss","no loss"
		
		for example:
		c_profis(100,1500)
		returns : "profit"
		
		c_profis(20,5)
		returns : "loss"
		
		c_profis(100,100)
		returns : "no loss"
		 */
		
		System.out.println(c_profits(buyPrice(100),sellPrice(200)));

	}
	public static int buyPrice(int num1) {
		return num1;
	}
	
	public static int sellPrice(int num2) {
		return num2;
	}
	
	public static String c_profits(int num1, int num2) {
		String str;
		if (num2>num1) {
			return str = "profit";
		}else if(num1>num2) {
			return str = "loss";
		}else {
			return str = "no loss";
		}
	}

}