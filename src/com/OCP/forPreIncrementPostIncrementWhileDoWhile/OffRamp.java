package com.OCP.forPreIncrementPostIncrementWhileDoWhile;

public class OffRamp {

	public static void main(String[] args) {
		
		int exist[] = {0,0,0,0,0,0};
		int x1 = 0;
		
		for(int x = 0; x < 4; ++x) exist[1] = x;  // pre-increment : Increment ==> assign incremented value 
		for(int x = 0; x < 4; x++) exist[0] = x;  // post-increment : Assign value ==> Increment 
		
		while( ++x1 < 3) exist[3] = x1;
		
		x1 = 0; 
		while( x1++<3) exist[2] = x1;
		
		x1 = 0; 
		do { exist[4] = x1; } while(x1++ < 7);
		
		x1 = 0;
		do { exist[5] = x1; } while( ++x1 < 7);
		
		for(int x : exist)
			//System.out.println("exist[" + x + "]");
		System.out.println(" " + x );
		 
	}
	
}
