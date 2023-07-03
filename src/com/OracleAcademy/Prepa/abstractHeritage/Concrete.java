package com.OracleAcademy.Prepa.abstractHeritage;

public class Concrete extends Sand{

	Concrete(){
		System.out.println("c ");
	}
	private Concrete(String s) {
	System.out.println(" private Constructor ");	
	}
}
