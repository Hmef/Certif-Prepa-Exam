package com.OCP81Z0808.DefaultAccess.building;

import com.OCP81Z0808.DefaultAccess.library.Book;

public class House {

	House() {
		
		Book book = new Book();
		
		// ********** Error **********
		//int c = issueCount; // Change Visibility to protected 
		
		// ********** Error **********
		//issueHistory();  // Change visibility to protected 
		
	}
}
