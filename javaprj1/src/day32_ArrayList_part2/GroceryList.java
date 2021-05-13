package day32_ArrayList_part2;

import java.util.ArrayList;

public class GroceryList {
	
	ArrayList<String> groceryList = new ArrayList<>();
	
	public void addGroceryItem(String item) { // we dont put static because we do not want it to belong to this particular class but also accessed by other classes!!!
		groceryList.add(item);
	} 
	
	public void printGroceryList() {
		System.out.println("You have " + groceryList.size() + " items in your grocery list");
		for(int i=0; i<groceryList.size(); i++) {
			System.out.println( (i+1) + ". " + groceryList.get(i));
		}
	}
	
	public void modifyGroceryItem(int position, String newItem) {
		groceryList.set(position, newItem);
		System.out.println("Grocery item " + (position+1) + " has been modified");
	}
	
	public void removeGroceryItem(int position) {
		groceryList.remove(position);
	}
	
	public String findItem(String searchItem) {
		int position = groceryList.indexOf(searchItem);
		if(position>=0) {
			return groceryList.get(position);
		}
		return null;
	}
	
}
