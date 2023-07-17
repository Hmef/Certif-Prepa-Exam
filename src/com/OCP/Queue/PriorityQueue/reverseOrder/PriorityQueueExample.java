package com.OCP.Queue.PriorityQueue.reverseOrder;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		
		Queue<Integer> integerQueue = new PriorityQueue<>();
		integerQueue.offer(9);
		integerQueue.offer(7);
		integerQueue.offer(5);
		
		//System.out.println(integerQueue);
		
		while(!integerQueue.isEmpty()) {
			System.out.println(integerQueue.poll());
		}
		
		// Part 2 - Collections.reverseOrder() method 
		System.out.println(" == PriorityQueue reverseOrder()  == ");
		
		Queue<Double> doubleQueue = new PriorityQueue<>(Collections.reverseOrder()); // reverseOrder() method 
		doubleQueue.offer(4.5);
		doubleQueue.offer(2.0);
		doubleQueue.offer(1.5);
		doubleQueue.offer(5.0);
		doubleQueue.offer(3.0);
		
		while (!doubleQueue.isEmpty()) {
			
			System.out.println(doubleQueue.poll());	
		}
		
		
		// Part 3 - String Queue 
		System.out.println(" ==  String Priority Queue - reverseOrder()  == ");
		
		Queue<String> stringQueue = new PriorityQueue<>(Collections.reverseOrder());
		stringQueue.offer("C");
		stringQueue.offer("D");
		stringQueue.offer("A");
		stringQueue.offer("F");
		stringQueue.offer("B");
		
		while (!stringQueue.isEmpty()) {
			
			System.out.println(stringQueue.poll());	
		}
	}
}
