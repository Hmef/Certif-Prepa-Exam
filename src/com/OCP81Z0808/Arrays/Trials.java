package com.OCP81Z0808.Arrays;

public class Trials {

	public static void main(String[] args) {
		
		double storeMinimum[] = new double[5];
		double trialArray[] = new double[15];
		
		for(int i = 0; i<storeMinimum.length; ++i) {
			
			//initialize the Array
			randomize(trialArray); 
			
			// find and store the minimum value 
			storeMinimum[i] = findMinimum(trialArray); 
		}
		
		// print the minimum value
		for(double minValue : storeMinimum)
			System.out.println( minValue);
		
		
	}
	
	public static void randomize(double[] valArray) {
		
		for(int i=0; i<valArray.length; ++i) {
			valArray[i] = Math.random() * 10.0;  //100.0
			//System.out.println(" valArray 1: " + valArray[i]);
		}
	}
	
	public static double findMinimum(double[] valArray) {
		
		double minValue = valArray[0];
		for(int i = 0; i<valArray.length; ++i) {
			minValue = Math.min(minValue, valArray[i]);
		}
		return minValue;
	}
}
