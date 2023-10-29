package com.OCA.PracticeTests.Chap1.JavaBasics.Ex4;

import java.sql.*;
import java.util.*;

public class BirthdayManager {

	
	// private Date rob = new Date();  // Compilation Error
	private java.util.Date rob = new java.util.Date();  
	private java.util.Date nelson = new java.util.Date();
	
	
	// Solution 1 ==> private java.util.Date rob = new java.util.Date(); 
	
	// Solution 2 ==> import java.util.Date
	
	/*
	 *  Error ==> Date class used is ambiguous ==> we need to specify the exact class to Use ==> java.util.Date 
	 *  
	 *  this class Date exist in this package java.util 
	 *  
	 *  Date class ==> 6 Constructors include Date() without parameter 
	 */
}
