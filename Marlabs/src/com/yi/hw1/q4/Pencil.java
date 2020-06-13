package com.yi.hw1.q4;

public class Pencil {
	private int[] Paper;

	Pencil() {
		Paper = new int[] {300, 400, 500, 600, 700};
	}

	public int[] getPaper() {
		return Paper;
	}

	public void setPaper(int[] paper) {
		Paper = paper;
	}
	
}
