package com.OCA.PracticeTests.Chap6.EncapsulationAndMethods.Ex10;

public class Jump {

	private int rope = 1;
	protected boolean outside; 
	
	public Jump() {
		
		// p1 ==> which line of code, inserted at line p1, causes the application to print 5
		outside = true;
	}
	
	public Jump(int rope) {
		
		this.rope = outside ? rope : rope+1;
	}
	
	public static void main(String[] args) {
		
		System.out.println(new Jump().rope);
	}
	
	/*
	 * 		A. this(4);
	 * 		B. new Jump(4);
	 * 		C. this(5);
	 * 		D. rope = 4;
	 * 
	 */
}
