package com.OCP81Z0808.AccessModifier.Private.building;

import com.OCP81Z0808.AccessModifier.Private.library.Book;

public class Main {

	
	public static void main(String[] args) {
		
		Book b1 = new Book();
		//b1.countPages(); // b1 is trying to access its private method countPages() Outside Book 
		
	}
	
	/*
	 * 
	 * Exam TIP ==> Do you think a Book instance can access its private member using a reference variable ??
	 * 				b1.countPages() ==> won't compile 
	 */
}
