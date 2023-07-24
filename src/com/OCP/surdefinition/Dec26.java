package com.OCP.surdefinition;

public class Dec26 {


	public static void main(String[] args) {
		
		short a1 = 6;
		//Dec26 d = new Dec26();
		
		new Dec26().go(a1);
		new Dec26().go(new Integer(7));
	}
	
	public void go(Short x) {
		System.out.println("S ");
	}
	
	public void go(Long x) {
		System.out.println("L ");
	}
	
	public void go(int x) {
		System.out.println("i ");
	}
	
	public void go(Number n) {
		System.out.println("N ");
	}
}
