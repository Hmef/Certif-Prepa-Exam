package com.OCP.NumberFormat.Parse;

import java.text.DecimalFormat;

public class DecimalFormatTest {

	public static void main(String[] args) {
		
		 double PI = 3.1415;
		 System.out.printf(" Value with 3 digits after decimal point %.3f %n", PI);
		 
		 DecimalFormat df = new DecimalFormat("###.###");
		 System.out.println(df.format(PI));
			
	}
}
