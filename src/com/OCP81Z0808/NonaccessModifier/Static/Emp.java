package com.OCP81Z0808.NonaccessModifier.Static;

public class Emp {

	private String name;
	static int bankVault;
	
	// CONSTANTs variables 
	public static final int MIN_AGE = 20;   
	static final int MAX_AGE = 70;
	
	static int getBankVaultValue() { // static method returns the value of static variable bankVault
		
		return bankVault;
	}
	
	static double interest(double num1, double num2, double num3) {
		
		return (num1 + num2 + num3)/3;
	}
	
	static double averageOfFirst100Integers() {
		
		int sum = 0;
		
		for(int i = 1; i <= 100; ++i) {
			
			sum += i;
			System.out.println(" sum ==> " + sum );
		}
		System.out.println(" sum - Outside for: " + sum);
		return (sum)/100; // ==> test and Compare 
	}
	
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
	
	/*
	 * 		We can define static methods to access or manipulate static variables 
	 */
}
