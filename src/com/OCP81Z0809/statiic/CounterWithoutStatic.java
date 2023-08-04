package com.OCP81Z0809.statiic;

public class CounterWithoutStatic {

	private static int count;
	
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

/*
 * 
  				What we need ?
  				we need a variable that can be shared across all instances 
  				==> Solution : decalre a variable static 
  				
  				A static variable is associated with its class not its object or instance
 * 
 				A static variable is initialized only once when execution of the program starts 
 * 
				A static variable shares its state with all instances of the class 
 * 
 * 
 */

