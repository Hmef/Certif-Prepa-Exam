package com.OCA.PracticeTests.Chap4.Arrays.Ex28;

public class Sudoku {

	static int[][] game = new int[6][6];
	
	public static void main(String[] args) {
		
		game[3][3] = 6;
		Object[] obj = game;
		obj[3] = "X";
		System.out.println(game[3][3]);
	}
}
