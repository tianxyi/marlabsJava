package com.yi.hw1.q5;

public class Water {
	private int a;
	private int b;
	private int c;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public void cap() {
		// TODO Auto-generated method stub
		int a, b, c;
		a = this.a;
		b = this.b;
		c = this.c;
		System.out.println(a * b * c);
	}
	public void taste() {
		// TODO Auto-generated method stub
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		return "Water [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
}
