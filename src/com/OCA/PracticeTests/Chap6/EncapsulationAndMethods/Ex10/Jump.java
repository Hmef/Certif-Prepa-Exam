package com.OCA.PracticeTests.Chap6.EncapsulationAndMethods.Ex10;

public class Jump {

	private int rope = 1;
	protected boolean outside; 
	
	public Jump() {
		
		// p1 ==> which line of code, inserted at line p1, causes the application to print 5
		this(4);
		// new Jump(4); // that instance is Nested 
		outside = true;
	}
	
	public Jump(int rope) {
		
		this.rope = outside ? rope : rope+1;  // outside ==> is false or true ??
		
		//System.out.println(" outside : " + outside);
	}
	
	public static void main(String[] args) {
		
		System.out.println(" new Jump().rope ==> " + new Jump().rope);  
		
		//System.out.println(rope); // Error it's not a static attribute 
	
		System.out.println(" new Jump() ==> " + new Jump().outside);
		System.out.println(" new Jump(4).rope ==>  " + new Jump(4).rope);
		System.out.println(" new Jump(5).outside ==> " + new Jump(5).outside);
	}
	
	/*
	 * 		A. this(4);
	 * 		B. new Jump(4);
	 * 		C. this(5);
	 * 		D. rope = 4;
	 * 
	 */
	
	/*
	 * 					Exam TIP
	 * 
	 * 		Remember that the Default initialization of a boolean INSTANCE variable is ==> false 
	 * 
	 */
	
	/*
	 * 
	 * 					Exam TIP 
	 * 
	 * 		B. new Jump(4) ==> that instance is Nested and the value of rope does not affect the surrounding instance of Jump 
	 * 						that the constructor was called in 
	 */
	
	
}
