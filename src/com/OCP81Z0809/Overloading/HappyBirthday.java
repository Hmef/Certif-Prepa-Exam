package com.OCP81Z0809.Overloading;

public class HappyBirthday {

	
	public static void wish(String name) {
		
		System.out.println(" Happy Birthday " +  name);
	}
	
	public static void wish() {
		
		wish("to you");
	}
	
	
	public static void main(String[] args) {
		
		wish();
		wish("Dear James ");
	}
}
