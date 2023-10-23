package com.OCP81Z0808.NonaccessModifier.Abstract;

abstract public class Person {

	private String name;
	
	public void displayName() {}; // ==> This isn't an abstract method - it has an empty body
	
	public abstract void perform(); // ==> This is an ABSTRACT method - it isn't followed by {}
	
	Person(){
		System.out.println(" Constructor - abstract Class Person ");
	}
	
	/*
	 * 		abstract only for Classes and methods 
	 * 
	 * 		Interface is an abstract entity by Default 
	 * 
	 * 		Exam TIP ==> abstract method Vs Non abstract method 
	 */
	
	/*
	 * 		Exam TIP: we can't defined this type of variables as abstract ==> instance - static - local - method parameters 
	 */
}
