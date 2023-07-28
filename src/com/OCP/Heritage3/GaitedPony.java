package com.OCP.Heritage3;

public class GaitedPony extends Horse {

	//String hands = "14";
	
	public static void main(String[] args) {
		
		String hands = "13.2";
		String result = new GaitedPony().getSize(hands); // hands == s ==> getSize(s) and print hands = "14"
		System.out.println(" " + result); // hands : 13.2 14
	}
	
	String getSize(String s) {
		
		System.out.println(" hands : " + s);
		return hands; // Error if hands ( of Horse class ) is private 
	}
}
