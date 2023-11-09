package com.OCA.PracticeTests.Chap2.DataTypes.Ex2;

public class Test {

	
	public static void main(String... args) {
		
		String chair, table = "metal";
		
		chair = chair + table;  // Error ==> Initialize variable chair ==> chair = null
		
		System.out.println(chair);   // print nullmetal after iniTializing chair variable
	}
}
