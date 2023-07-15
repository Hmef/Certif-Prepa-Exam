package com.OCP.Queue;

import java.util.*;

public class Priorities {

	public static void main(String[] args) {
		
		PriorityQueue<String> toDo = new PriorityQueue<>();
		toDo.add("dishes");
		toDo.add("laundry");
		toDo.add("bills");
		toDo.offer("bills");
		
		System.out.println(toDo);  // [bills, bills, dishes, laundry]
		System.out.println(" toDo.peek() ==> " + toDo.peek());
		System.out.println(toDo.size() + " " + toDo.poll());  // 4 bills
		System.out.println(toDo);  // [bills, laundry, dishes]
		System.out.println(" " + toDo.peek() + " " + toDo.poll());  // bills bills
		System.out.println(toDo); // [dishes, laundry]
	}
}
