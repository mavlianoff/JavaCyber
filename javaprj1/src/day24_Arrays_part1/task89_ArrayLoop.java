package day24_Arrays_part1;

public class task89_ArrayLoop {

	public static void main(String[] args) {
		//Display each array element in the console by using for loop
		
		String[] shoppingList = {"cheese", "pumpkin", "bread", "eggs", "milk", "almonds"};
		
		for(int i = 0; i < shoppingList.length; i++) {
			System.out.print(shoppingList[i] + " ");
		}

	}

}
