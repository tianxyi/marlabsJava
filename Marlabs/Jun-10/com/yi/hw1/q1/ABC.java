package com.yi.hw1.q1;

public class ABC {
	private int a;
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public static void main(String[] args) {
		int val = 200;
		System.out.println(val);
		ABC test = new ABC(), t1 = new ABC(), t2 = new ABC(), t3 = new ABC();
		t1.setA(1);
		t2.setA(2);
		t3.setA(3);
		System.out.println(test.getA() + " "+ t1.getA() + " " + t2.getA() +" " + t3.getA());
		
//		System.out.println(test.getA());
//		test.setA(1);
//		System.out.println(test.getA());
//		test.setA(2);
//		System.out.println(test.getA());
//		test.setA(3);
//		System.out.println(test.getA());
//		test.setA(4);
	}
}
