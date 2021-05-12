package day31_ArrayList;

import java.util.ArrayList;

public class ShoppingList {
	
	public static void main(String[] args) {
		
		ArrayList<String> shoppingList = new ArrayList<>();
		shoppingList.add("paper towel");
		shoppingList.add("dish soap");
		shoppingList.add("trash bag");
		shoppingList.add("clorox");
		shoppingList.add("gloves");
		shoppingList.add("shovel");
		
		//Print number of items
		System.out.println("Number of items: " + shoppingList.size());
		
		//print all items in single line
		System.out.println(shoppingList.toString());
		
		//print first and last item in single line
		System.out.println(shoppingList.get(0) + "|" + shoppingList.get(shoppingList.size()-1));
		
		shoppingList.remove("paper towel");
		shoppingList.remove("shovel");
		
		System.out.println(shoppingList.toString());
		System.out.println(shoppingList.get(0));
		
		shoppingList.remove(0);
		System.out.println(shoppingList.toString());
		
		//print each item
		for(String each: shoppingList) {
			System.out.println(each);
		}
		
		//remove all items at once
		shoppingList.clear();
		boolean empty = shoppingList.isEmpty();
		System.out.println(empty);
		System.out.println(shoppingList.toString());
		
		
		
		
		
		
	}
}
