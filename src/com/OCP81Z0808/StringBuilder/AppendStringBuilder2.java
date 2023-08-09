package com.OCP81Z0808.StringBuilder;

public class AppendStringBuilder2 {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append("java");
		sb1.append(new Person("Oracle"));
		//System.out.println(sb1); // Solution ==> Override toString() method 
		System.out.println(sb1.toString());  
	}
}


/*
 * 
 * 				******** Exam TIP ********
 				Error : Before Overriding toString() method 
 						==> 
 						Person@15db9742
 						
 				
 				Solution : Overriding toString() method 
 						==>
 						javaOracle
 						
 */

