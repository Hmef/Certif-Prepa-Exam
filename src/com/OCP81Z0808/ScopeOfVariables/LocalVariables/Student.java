package com.OCP81Z0808.ScopeOfVariables.LocalVariables;

public class Student {

	private double marks1, marks2, marks3;  // instance variables
	private double maxMarks = 100;       // instance variable
	
	public double getAverage() {
		
		double avg = 0;  //  ==> local variable aavg
		avg = ((marks1 + marks2 + marks3) / (maxMarks * 100)) / 100;
		return avg;
	}
	
	public void setAverage(double val) {
		//avg = val;   // this code won't compile because avg is inaccessible  outside the method getAverage()
	}
}
