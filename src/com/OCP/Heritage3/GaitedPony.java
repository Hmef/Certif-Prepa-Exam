package com.OCP.Heritage3;

public class GaitedPony extends Horse {

	//static String hands = "14";
	
	public static void main(String[] args) {
		
		String hands = "13.2";
		String result = new GaitedPony().getSize(hands); // getSize(hands) ==> return hands of Horse Class 
		System.out.println(" " + result);
	}
	
	String getSize(String s) {
		
		System.out.println(" hands : " + s);
		return hands;
	}
}
