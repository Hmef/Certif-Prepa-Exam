package com.OCP17.Thread;

import java.util.concurrent.locks.*;

public class Bank {

	private Lock vault = new ReentrantLock();
	private int total = 0;
	
	public void deposit(int value) {
		
		vault.tryLock();
	}
}


// OCP Java SE 17 Developer 