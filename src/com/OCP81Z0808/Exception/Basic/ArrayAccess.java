package com.OCP81Z0808.Exception.Basic;

public class ArrayAccess {

	public static void main(String[] args) {
		
		String[] students = {"Paul","Linda",null};
		System.out.println(students[1].length()); // 
		//System.out.println(students[2].length());
		System.out.println(students.length);  // number of elements 
		System.out.println(students[5].length()); // ==> 
		
		/*
		 * Exam TIP : students[1].length()      and 	students.length
		 */
		
		/*
		 * Throwing an Exception or an Error - ArrayIndexOutOfBoundsException ==> trying to access the elemnt at array position 5
		 */
	}
}
