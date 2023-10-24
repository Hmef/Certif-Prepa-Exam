package com.OCP81Z0808.NonaccessModifier.Static;

public class Emp {

	private String name;
	static int bankVault;
	
	// CONSTANTs variables 
	public static final int MIN_AGE = 20;   
	static final int MAX_AGE = 70;
	
	/*
	 * 	Exam TIP: The Preferred Way to access static members is by Using the Class Name (Emp.bankVault)
	 * 
	 * 	Using Object reference variable to access static members make them appear appear to belong to an object
	 */
	
	/*
	 * 		Constants ==> you can define a Constant as a non-static member 
	 * 
	 * 			==> it's Common Practice to define Constants as static members ==> because doing so allows the constant values  
	 * 				to be used across the objects and classes 
	 */
}
