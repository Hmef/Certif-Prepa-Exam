package com.OCP81Z0808.Char;

public class MyChar {

	public static void main(String[] args) {
		
		int myInt = 7;
		bool result = true;  // ==> Fail to compile 
		
		if(result == true) {
			do
				System.out.println(myInt);
			while(myInt > 10);
		}
	}
	
	/*
	 * 		Exam TIP : The question tries to trick you with Complex code that doesn't use any if constructs or do-while loops !
	 * 
	 * 					as we can see, it uses an incorrect data type ==> bool 
	 * 					to declare and initialize the variable result
	 * 
	 * 					==> the code will fail to compile
	 */
}
