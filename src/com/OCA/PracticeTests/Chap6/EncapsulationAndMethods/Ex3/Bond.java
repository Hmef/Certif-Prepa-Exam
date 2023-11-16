package com.OCA.PracticeTests.Chap6.EncapsulationAndMethods.Ex3;

public class Bond {

	public static int price = 5;  // static to call its in the static main method 
	
	public boolean sell() {
		
		if(price<10) {
			price++;
			System.out.println("if price < 10 :  " + price);
			
			return true;	
		} else if(price>=10) {
			
			System.out.println(" else if price >= 10 : " + price);
			return false;
		}
		return true;  // 
	}
	
	public static void main(String[] args) {
		
		new Bond().sell();
		new Bond().sell();
		new Bond().sell();
		
		// test of Increment value 
		new Bond().sell();
		new Bond().sell();
		new Bond().sell();
		new Bond().sell();
		
		System.out.println(price);  // if price is not static we can't call it here 
		
		System.out.println(" ++price : " + ++price);  // pre-increment ( Increment the value Before using it)
		System.out.println(" --price : " + --price);
		
		System.out.println(" price++ : " + price++);  // post-increment 
		System.out.println(" ==> price's value after post-Increment : " + price);
		System.out.println(" price-- : " + price--);
		
		
	}
}
