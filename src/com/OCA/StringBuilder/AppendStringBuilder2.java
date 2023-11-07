package com.OCA.StringBuilder;

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
 				
 		
 		Person@15db9742 : name of the class followed by the @ char and unsigned Hexadecimal representation of 
 						  the hash code of the object 
 						  
 		hashCode() method : return the hash code of the object ( 15db9742  )
 */

