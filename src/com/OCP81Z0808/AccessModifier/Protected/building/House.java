package com.OCP81Z0808.AccessModifier.Protected.building;

import com.OCP81Z0808.AccessModifier.Protected.library.Book;

public class House {   // ==> House and Book are unrelated classes 

	House(){
		
		Book book = new Book();
		String value = book.isbn;
		//String authorr = book.author;   // ==> author has a protected access 
		//book.modifyTemplate(); // ==> fails to access to this method of Book class ==> protected access 
	}
	
	
	/*
	 * 
	 * Unrelated classes are defined in separate packages 
	 */
}
