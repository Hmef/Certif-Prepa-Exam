package com.OCP.Objectss;

public class Chilis {

	String colors;
	int hotness;
	
	public Chilis(String c, int h) {
		colors = c;
		hotness = h;
	}
	public boolean equals(Object o) {
		
		if(this == (Chilis)o) 
			return true;
		return false;	
	}
	
	public String toString() {
		
		return colors + "" + hotness;
	}
}
