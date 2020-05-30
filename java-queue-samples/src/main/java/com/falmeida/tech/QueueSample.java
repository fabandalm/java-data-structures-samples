package com.falmeida.tech;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueSample {

	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<>();

		queue.add("element 1");

		queue.offer("element 2");
		
		queue.add("Mazda");
		
		System.out.println(queue.contains("Mazda"));
		
		queue.poll();
		
		Iterator<String> iterator = queue.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
	
}
