package com.OCP81Z0808.AccessModifier.Protected.building;

import com.OCP81Z0808.AccessModifier.Protected.library.Book;

public class StoryBook extends Book {

	StoryBook(){
		
		String authorS = author;
		modifyTemplate();
		
		/*
		 *   
		 *   ==> Exam TIP : A derived class in a separate package CAN'T access Protected members of its base class 
		 *   				using reference variables 
		 * 
		 */
		
		Book book = new Book();
		//book.author;
		//book.modifyTemplate();
		String a = author;  // Exam TIP ==> access Only by Inheritance 
		
		// ==> Exam TIP : access PUBLIC members using reference variable
		String isbn = book.isbn;   
		book.printBook();   
	}
}
