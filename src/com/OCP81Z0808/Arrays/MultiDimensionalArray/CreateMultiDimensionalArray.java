package com.OCP81Z0808.Arrays.MultiDimensionalArray;

public class CreateMultiDimensionalArray {

	public static void main(String[] args) {
		
		/*
		 * ************ Multidimensional array Declaration ************
		 * 
		 */
		
		int[][] multiArr; // this declaration is the preferred ==> easy to read 
		
		int[] multArrr[];
		
		int multiiArr[][];
		
		/*
		 *  this code won't compile 
		 * 
		 */
		//int intArr[2][];  
		// intArr = new int[][]; // size missing 
		
		
		/*
		 * ************ Allocation ************
		 * 
		 * Array is an Object - Allocation by using ==> new 
		 * 
		 */
		
		multiiArr = new int[2][]; 
		multiArr = new int[2][3];
		
		/*
		 * ****** Exam TIP ******
		 */
		//multiArr = new [][3]; // ERROR ==> size in first square bracket missing 
		
		/*
		 * ************ Intializing ************
		 * 
		 * Array is an Object - Allocation by using ==> new 
		 * 
		 */
		
		// Using for loop 
		for(int i=0; i<multiArr.length;i++)
			for(int j=0; j<multiArr[i].length; j++)
				multiArr[i][j] = i+j;
		
		// Without using for loop 
		multiArr[1][2] = 10;
		multiArr[0][0] = 2200;
		multiArr[2][2] = 50;
		multiArr[2][3] = 23;
		
		int[][] multiiArrr = { {1,2} , {2,3,5,6} };
	}
}
