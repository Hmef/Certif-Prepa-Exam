package com.OCP81Z0808.DefaultAccess.building;

import com.OCP81Z0808.DefaultAccess.library.Book;

public class StoryBook extends Book {

	public StoryBook() {
		
		// Error 
		int c = issueCount; // Change visibility to protected 
		
		issueHistory();  // Change Visibility to protected 
	}
}


/*
 *			**************** ERROR ****************
  
  			The classes StoryBook and House don't reside in 
  			the same package as the class Book
 * 
 * 
 */

