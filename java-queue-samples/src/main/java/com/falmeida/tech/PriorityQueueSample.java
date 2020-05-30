package com.falmeida.tech;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueSample {

	public static void main(String[] args) {
		
		Queue<String> queue = new PriorityQueue<>();

		queue.add("D");
		queue.add("A");
		queue.add("B");
		queue.add("C");
		queue.add("E");
		
		Iterator<String> iterator = queue.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
	
}
