package day47_collection_part2;

import java.util.Stack;

public class StackExample {				//LIFO
	
	public static void main(String[] args) {
		
		//Creating object: (1)Regular way -Class & Class (2) Polymorphic -Parent/interface & Child Class 
		
		Stack<Integer> numsStack = new Stack<>();
		
		numsStack.add(50);
		numsStack.add(70);
		numsStack.add(500);
		numsStack.add(50);

		System.out.println(numsStack.toString()); 
		
		//check value on top of stack
		System.out.println(numsStack.peek());
		
		//read value on the top of stack then remove it
		numsStack.pop();
		
		System.out.println(numsStack.toString());
		
		//check value on top of stack
		System.out.println(numsStack.peek());
		
		System.out.println(numsStack.get(0));
				
	}

}
