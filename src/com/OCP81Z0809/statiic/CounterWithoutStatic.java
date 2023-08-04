package com.OCP81Z0809.statiic;

public class CounterWithoutStatic {

	private int count;
	
	public CounterWithoutStatic() {
		count++;
	}
	
	public void printCount() {
		
		System.out.println(" Number of instances created is : " + count);
	}
	
	public static void main(String[] args) {
		
		CounterWithoutStatic anInstance = new CounterWithoutStatic();
		anInstance.printCount();
		
		CounterWithoutStatic anotherInstance = new CounterWithoutStatic();
		anotherInstance.printCount();
	}
}
