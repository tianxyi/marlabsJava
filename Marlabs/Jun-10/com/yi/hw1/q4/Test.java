package com.yi.hw1.q4;

public class Test {
	public static void main(String[] args) {
		Pencil pencil1 = new Pencil();
		int[] papers = pencil1.getPaper();
		for(int paper : papers) {
			System.out.println(paper);
		}
	}
}
