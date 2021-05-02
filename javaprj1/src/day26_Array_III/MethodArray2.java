package day26_Array_III;
import java.util.Scanner;
public class MethodArray2 {
	
	public static void main(String[] args) {
		
		System.out.println(findCar(4, "Honda")); //true
//		createArray(3);
		
		
		
	}
	
	public static String[] createArray(int arraySize) {
		Scanner scan = new Scanner(System.in);
		String[] carArray = new String[arraySize];
		for (int i=0; i<carArray.length; i++) {
			System.out.print("Enter your car #" + (i+1) + ": ");
			carArray[i] = scan.next();
		}
		return carArray; // alwaya return REFERENCE!!!
	}
	
	public static boolean findCar(int number, String toFindCar) {
		for(String car: createArray(number)) {
			if(car.equalsIgnoreCase(toFindCar)) {
				return true;
			}
		}
		return false;
		
	}
	

}
