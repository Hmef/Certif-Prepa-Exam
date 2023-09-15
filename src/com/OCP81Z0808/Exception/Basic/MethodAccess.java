package com.OCP81Z0808.Exception.Basic;

public class MethodAccess {

	public static void main(String[] args) {
		
		myMethod();
	}
	
	public static void myMethod() {
		
		System.out.println("myMethod");
		myMethod();
	}
	
	/*
	 *  myMethod calls itself Recursively 
	 *  without an exit condition 
	 */
	
	/*
	 * these recursive calls result in a Stack Overflow at Runtime
	 */
}
