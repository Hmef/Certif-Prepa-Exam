package com.OCP81Z0808.Arrays;

public class CreateArray {

	public static void main(String[] args) {
		
		/*
		 * One Dimensional Array Declaration 
		 */
		int[] intArr; 
		
		/*
		 * Allocation 
		 */
		int arr[] = new int[2*3];  // size ==> 2*3
		
		int x = 2, y = 5;
		int[] intArra= new int[x*y];    // size ==> x*y
		
		intArr = new int[Math.max(2, 3)];  // size ==> Math.max(2, 3)
		
		/*
		 * ******* Exam TIP ******* 
		 */
		//int intArr[] = new int[2.4]; // size must be integer 
		
		/*
		 *  Intialization 
		 */
		
		// Without using for loop 
		int[] intArray = new int[] {4, 9, 104};
		for(int t : intArray) {
			System.out.println(t);
		}
		
		String objectArray[] = new String[] {"Paul","Henry","Christine","Jeff"};
		
		objectArray[2] = null; // we can remove an array position like this 
		for(String st : objectArray) {
			System.out.println(st);
		}
		/*
		 * Output :
		 * Paul 
		 * Henry
		 * null
		 * Jeff
		 */
		
		
		
		// Using a for loop 
		int[] arrayInt = new int[2*2];
		for(int i = 0; i<arrayInt.length; i++) {
			arrayInt[i] = i + 4;
		}
		
		String[] strArray = new String[Math.max(1, 2)];
		for(int i = 0; i<strArray.length; i++) {
			strArray[i] = new String("Hello");
			System.out.println(strArray[i]);
		}
		
		/*
		 * Exam TIP 
		 */
		System.out.println(strArray[5]); // throw the exception ==> ArrayIndexOutOfBoundsException
		
		/*
		 * Exam TIP 
		 */
		
		int[] intArrr;
		intArrr = new int[] {1, 3, 7}; // use new to initialize the values (Declare and Initialize the Array)
		
		// Error
		//int[] intArrr;
		//intArrr = {1, 3, 7};
	}
}
