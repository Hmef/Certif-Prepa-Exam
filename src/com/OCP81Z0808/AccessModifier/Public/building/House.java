package com.OCP81Z0808.AccessModifier.Public.building;

import com.OCP81Z0808.AccessModifier.Public.library.Book;

public class House {

	House() {
		
		Book book = new Book();
		String value = book.isbn;  // variable isbn is accessible in House class 
		book.printBook();
		
	}
	
	/*
	 * 
	 *   House and Book are unrelated classes, they're defined in separate packages 
	 *   
	 *   House class doesn't enjoy any advantages by being defined in the same package or 
	 *   being a derived class 
	 * 
	 */
}
