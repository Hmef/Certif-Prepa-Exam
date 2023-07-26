package com.OCP.Heritage2;

public class Cool extends SuperCool {

	public static void main(String[] args) {
		
		new Cool().go();
		new Cool().doStuff();
		
	}
	
	void go() {
		
		SuperCool s = new Cool();
		Cool c = (Cool) s;
	}
	
	void doStuff() {
		
		os += " cool ";
	}
}
