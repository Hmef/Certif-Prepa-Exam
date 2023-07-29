package com.OCP81Z0808.Arrays;

public class Trials {

	public static void main(String[] args) {
		
		
	}
	
	public static void randomize(double[] valArray) {
		
		for(int i=0; i<valArray.length; ++i) {
			valArray[i] = Math.random() * 100.0;
		}
	}
	
	public static double findMinimum(double valArray[]) {
		
		double minValue = valArray[0];
		for(int i = 0; i<valArray.length; ++i) {
			minValue = Math.min(minValue, valArray[i]);
		}
		return minValue;
	}
}
