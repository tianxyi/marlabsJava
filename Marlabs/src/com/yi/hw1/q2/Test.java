package com.yi.hw1.q2;

public class Test {
	public static void main(String[] args) {
	
		Class1 test1 = new Class1(), 
				test2 = new Class1(2,2,2), 
				test3 = new Class1(3,3,3), 
				test4 = new Class1(4,4,4),
				test5 = new Class1(5,5,5);
		System.out.println(test1);
		System.out.println(test2);
		System.out.println(test3);
		System.out.println(test4);
		System.out.println(test5);
		System.out.println(test1.mulMethod(1, 2, 3, 4));
		
	}
	
}
