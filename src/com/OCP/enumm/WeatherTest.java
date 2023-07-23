package com.OCP.enumm;

public class WeatherTest {

	static WeatherTest w;
	
	public static void main(String[] args) {
		//System.out.println();
	}
	
	enum Weather{
		RAINY, SUNNY;
		int count = 0;
		Weather(){
			System.out.println("c");
			count++;
		}
	}
}
