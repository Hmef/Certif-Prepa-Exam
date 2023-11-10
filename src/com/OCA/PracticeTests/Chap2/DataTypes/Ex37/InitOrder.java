package com.OCA.PracticeTests.Chap2.DataTypes.Ex37;

public class InitOrder {

	public String first = "instance";
	
	public InitOrder(){
		
		first = "constructor";
	}
	
	{  first = "block";  }
	
	public void print() {
		System.out.println(first);
	}
	
	public static void main(String[] args) {
		
		new InitOrder().print();
		
	}
	
	/*
	 *     Output ??
	 *     
	 *     A. block
	 *     B. constructor
	 *     C. instance
	 *     D. The code does not compile
	 * 
	 */
}
