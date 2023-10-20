package com.OCP81Z0808.AccessModifier.Private.library;

public class CourseBook extends Book {

	CourseBook(){
		
		//countPages();  // ==> CourseBook can't access private method countPages()
	}
}
