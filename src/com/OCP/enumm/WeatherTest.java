package com.OCP.enumm;

public class WeatherTest {

	 static Weather w;
	
	public static void main(String[] args) {
		
		System.out.println(w.RAINY.count + " " + w.SUNNY.count + " ");
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
