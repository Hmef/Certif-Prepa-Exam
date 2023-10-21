package com.OCP81Z0808.AccessModifier.Default.building;

import com.OCP81Z0808.AccessModifier.Default.library.Book;  // Class Book isn't accessible in class StoryBook

public class StoryBook extends Book {

	public StoryBook() {
		// TODO Auto-generated constructor stub
		
		//int c = issueCount;  // default access ==< private package 
		//issueHistory(); 
	}
	
/*
 * 		StoryBook and House classs don't reside in the same package as the class Book
 * 		they can't access issueCount variable and issueHistory() method 
 * 
 */
}
