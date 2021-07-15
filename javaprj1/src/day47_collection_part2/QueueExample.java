package day47_collection_part2;

import java.util.*;

public class QueueExample {						//FIFO
	
	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<>();
		
		queue.add("Mike");
		queue.add("Ozzy");
		queue.add("Jamal");
		queue.add("Asiya");
		
		System.out.println(queue.toString());
		
		String name = queue.remove(); 			//retrieves and removes the head of the queue
		System.out.println(name);
		
		System.out.println(queue.toString());
		
		name = queue.poll();					//retrieves and removes the head of the queue. Difference: returns null if queue is empty
		System.out.println(name);
		
		System.out.println(queue.toString());
		
		//get the element at the front of the queue without removing it using peek()
		name = queue.peek();
		System.out.println(name);
		System.out.println(queue.toString());
		
		
	}

}
