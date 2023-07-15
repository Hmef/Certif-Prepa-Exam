package com.OCP.NumberFormat.Parse;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatExample {

	public static void main(String[] args) {
		
		// Formatting Decimal Number 
		 double PI = 3.1415;
		 System.out.printf(" Value with 3 digits after decimal point %.3f %n", PI);
		 
		 // DecimalFormat 
		 DecimalFormat df = new DecimalFormat("###.###");
		 System.out.println(df.format(PI)); // 3,142
		 
		 // NumberFormat ',' for Locale.FRENCH  
		 NumberFormat.getInstance(Locale.FRENCH).format(1.235d); // 1,235
		 NumberFormat.getInstance(Locale.ENGLISH).format(1.235d);  // 1.235
		 
		 // NumberFormat MinimumFractionDigits & MaximumFractionDigits
		 NumberFormat instance = NumberFormat.getNumberInstance();
		 //NumberFormat instance = NumberFormat.getInstance();
		 instance.format(1.1111);
		 instance.setMaximumFractionDigits(1);
		 instance.setMinimumFractionDigits(2);
		 instance.setGroupingUsed(false);
		 instance.setRoundingMode(RoundingMode.HALF_UP);
		 
		 System.out.println("  ");
		 System.out.println(" == RoudingMode.HALF-UP == ");
		 
		 System.out.println(instance.format(1.643322));
		 System.out.println(instance.format(1234.665D));
		 
		 
		 final NumberFormat instanceInteger = NumberFormat.getNumberInstance();
		 instanceInteger.setMaximumIntegerDigits(6);
		 instanceInteger.setMinimumIntegerDigits(4);
		 System.out.println("  ");
		 instanceInteger.setGroupingUsed(true); // GroupingUsed(true)
		 System.out.println(" == GroupingUsed(true) == ");
		 String ss = instanceInteger.format(12345D);
		 String sss = instanceInteger.format(1D);
		 System.out.println(ss);
		 System.out.println(sss);
		 
		 instanceInteger.setGroupingUsed(false);  // GroupingUsed(false)
		 System.out.println("  ");
		 System.out.println(" == GroupingUsed(false) == ");
		 
		 String ss2 = instanceInteger.format(12345D);
		 String sss2 = instanceInteger.format(1D);
		 System.out.println(ss2);
		 System.out.println(sss2);

		 // MaximumIntegerDigits < MinimumIntegerDigits 
		 instanceInteger.setMaximumIntegerDigits(1);
		 String ss3 = instanceInteger.format(12345D);
		 String sss3 = instanceInteger.format(1D);

		 System.out.println("  ");
		 System.out.println(" == MaximumIntegerDigits < MinimumIntegerDigits == ");
		 System.out.println(ss3);
		 System.out.println(sss3);
		 
		 //String s = instance.format(1.543366744);
		 //System.out.println(" s : " + s);
		 
		 //DecimalFormat applPattern
		 NumberFormat instancePattern = NumberFormat.getNumberInstance();
		 ((DecimalFormat) instancePattern).applyPattern("###.00 €");
		 String ssPattern = instancePattern.format(1.65432);
		 System.out.println("  ");
		 System.out.println(" DecimalFormat - applyPattern");
		 System.out.println(ssPattern);
		 
		 
	}
}
