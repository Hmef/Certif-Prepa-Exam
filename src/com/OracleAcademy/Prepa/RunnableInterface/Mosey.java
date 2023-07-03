package com.OracleAcademy.Prepa.RunnableInterface;

import java.util.Iterator;

public class Mosey implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 1000; i++) {
			System.out.println(Thread.currentThread().getId() + "-" + i + " ");
		}
	}

}
