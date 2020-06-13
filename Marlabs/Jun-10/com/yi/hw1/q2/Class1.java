package com.yi.hw1.q2;

public class Class1 {
	private int a;
	private int b;
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
	Class1(){
		
	}
	public Class1(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b * c;
	}
	@Override
	public String toString() {
		return "Class1 [a=" + a + ", b=" + b + "]";
	}
	public int mulMethod(int var1, int var2, int var3, int var4) {
		return var1 * var2 * var3 * var4;
	}
	
	
}
