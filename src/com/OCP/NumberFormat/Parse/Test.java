package com.OCP.NumberFormat.Parse;

import java.text.NumberFormat;
import java.text.ParseException;

public class Test {

	public static void main(String[] args) {
		
		String s = "123.456xyz";
		NumberFormat nf = NumberFormat.getInstance();
		try {
			System.out.println(nf.parse(s));
			nf.setMaximumFractionDigits(2);
			System.out.println(nf.format(s));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
