package day24_Arrays_I;

public class Array {

	public static void main(String[] args) {
		
		int[] myList = {10,20,30,40, 55, 75, 80}; //IMPORTANT: EVERYTHING SHOULD BE IN THE SAME LINE
		String[] myFruits = {"Apple", "Orange", "Pear", "Grapes"};

		System.out.println(myList[0]);
		System.out.println("Number of elements in array: " + myList.length);
		
		System.out.println(myFruits[3]);
		System.out.println("Number of elements in array: " + myFruits.length);
		
		for(int i=0; i < myList.length; i++) {
			System.out.print(myList[i] + " ");
		}
		
		System.out.println();
		
		for(int j=0; j < myFruits.length; j++) {
			System.out.print(myFruits[j] + " ");
		}
		
		System.out.println();
		
		//Find the average of numbers:
		int[] scores = {12,45,76,87,34,76,87,34,67,98,23,12,32,35,54,62};
		
		int sum = 0, average=0;
		for(int k = 0; k < scores.length; k++){
			sum+=scores[k];
		}
		average = sum / scores.length;
		System.out.println("Sum is: " + sum + " Average is: " + average);
		
	}

}
