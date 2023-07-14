package com.OCP.NumberFormat.Parse;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class DecimalFormatTest {

	public static void main(String[] args) {
		
		// Formatting Decimal Number 
		 double PI = 3.1415;
		 System.out.printf(" Value with 3 digits after decimal point %.3f %n", PI);
		 
		 DecimalFormat df = new DecimalFormat("###.###");
		 System.out.println(df.format(PI));
		 
		 // NumberFormat ',' for Locale.FRENCH  
		 NumberFormat.getInstance(Locale.FRENCH).format(1.235d); // 1,235
		 NumberFormat.getInstance(Locale.ENGLISH).format(1.235d);  // 1.235
		 
		 // NumberFormat MinimumFractionDigits & MaximumFractionDigits
		 NumberFormat instance = NumberFormat.getNumberInstance();
		 //NumberFormat instance = NumberFormat.getInstance();
		 instance.format(1.1111);
		 instance.setMaximumFractionDigits(4);
		 instance.setMinimumFractionDigits(2);
		 
		 System.out.println(" instance : " + instance.format(1.643322));
			
	}
}
