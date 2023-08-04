package com.OCP81Z0809.statiic;

public class Counter {

	private static int count;
	
	public Counter() {
		count++;
	}
	
	public static void printCount() {
		
		System.out.println(" Number of created instances is : " + count);
	}
	
	public static void main(String[] args) {
		
		//Counter instance1 = new Counter();
		new Counter();
		Counter.printCount();
		
		//Counter instance2 = new Counter();
		new Counter();
		Counter.printCount();
	}
}
