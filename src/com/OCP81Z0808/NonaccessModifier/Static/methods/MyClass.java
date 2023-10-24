package com.OCP81Z0808.NonaccessModifier.Static.methods;

public class MyClass {

	static int x = count();  // ==> Compilation Error : static variable can't access the instance members of a class 
	
	int count() {

		return 10;
	}
	
	static int result() {
		
		return 20;
	}
	
	static int y = result();
	
	// Non static variable referencing a static method 
	int nonStaticResult = result();
	
	int nonStaticResultMeth() {   // ==> non Static method using static method 
		
		return result();
	}
	
	/*
	 * 	Exam TIP ==> static methods and variables can't access the non-static attribute or method  
	 * 
	 */
}
