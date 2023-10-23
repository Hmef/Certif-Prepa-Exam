package com.OCP81Z0808.NonaccessModifier.Final;

public final class Person {

	
	final long MAX_AGE = 90;
	
	final StringBuilder name = new StringBuilder("SH");
	
	Person(){
		MAX_AGE = 99; // won't compile - reassignment not allowed
		
		name.append("raya");  //   ==> can call methods on a final variable that change its state 
		
		name= new StringBuilder(); //  ==> won't compile - you can't reassign another object to a final variable
	}
	public void printName() {};
	
	
}
