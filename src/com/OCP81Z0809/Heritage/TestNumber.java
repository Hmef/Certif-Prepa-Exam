package com.OCP81Z0809.Heritage;

public class TestNumber {

	
	public static double sum(Number []nums) {
		
		double sum = 0.0;
		for(Number num : nums) {
			sum += num.doubleValue();
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		// create a Number array
		Number []nums = new Number[4];
		
		// assign derived class objects
		nums[0] = new Byte((byte)10);
		nums[1] = new Integer(10);
		nums[2] = new Float(10.0F); 
		nums[3] = new Double(10.0f);
		
		// pass the Number array to sum and print it  
		System.out.println(" The sum is : " + sum(nums));
	}
}

/*
 * 
			A Number Reference can hold any of its derived type objects 
 * 
 			the nums array holds objects of type Byte, Integer, Float and Double
 * 
 * 
  			Why using double as the return type of the sum method ??
			the double type can hold a largest range of value 
 * 
 * 
  			Object <- Number <- Byte - Integer - Float - Double 
 * 
 */

