package com.falmeida.tech;

import java.util.LinkedList;
import java.util.Queue;

public class QueueOperationsSample {
	
	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<>();
		
		// Add
		queue.add("A");
		queue.add("B");
		queue.add("C");
		queue.add("D");
		queue.add("E");
		
		//Offer
		queue.offer("F");
		
		// Take element from the queue
		String string1 = queue.poll();
		
		System.out.println("Queue Poll: " + string1);
		
		String string2 = queue.remove();
		
		System.out.println("Queue Remove: " + string2);
		
	}

}
