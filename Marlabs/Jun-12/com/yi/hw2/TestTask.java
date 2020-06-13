package com.yi.hw2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestTask {
	public static void main(String[] args) {
		//test q1, please input a String
		System.out.println("--Q1 Result:");
		String testQ1 = "apple";
		testQ1 = q1.reverseString(testQ1);
		System.out.println(testQ1);
		
		//test q2, please input a String
		System.out.println("--Q2 Result:");
		String testQ2 = "pinapple";
		Map<Character, Integer> m = q2.countTheNumberOfWords(testQ2);
		for (char key : m.keySet()) {
			System.out.println(key +":" +m.get(key));
		}
		
		//test q3, please input a HashMap
		System.out.println("--Q3 Result:");
		Map<Character, Integer> testQ3 = new HashMap<>();
		testQ3.put('a', 1);
		testQ3.put('b', 4);
		q3.iterateMapFor(testQ3);
		q3.iterateMapWhile(testQ3);
		
		//test q4, please input a string or number.
		System.out.println("--Q4 Result:");
		String pStr = "abccba";
		int a = 1213321;
		System.out.println(q4.isPalindrome(a));
		System.out.println(q4.isPalindrome(pStr));
		
		//test q5, please input a ArrayList
		System.out.println("--Q5 Result:");
		List<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		q5 q = new q5(l);
		q.iterateListFor();
		q.iterateListForEach();
		q.iterateListWhile();
		
		//test q6, please input a String
		System.out.println("--Q6 Result:");
		String testQ6 = "abcccca";
		q6.findDuplicateChar(testQ6);
		
		//test q7, please input an Array
		System.out.println("--Q7 Result:");
		int[] arr = {1,3,4,5,6,7,0};
		System.out.println(q7.findSecondHighestNumber(arr));
		
		//test q8, please input a String
		System.out.println("--Q8 Result:");
		String testQ8 = "abc bca ddd";
		System.out.println(q8.removeWhiteSpace(testQ8));
		
		//test q9, please input an Array.
		System.out.println("--Q9 Result:");
		int[] arrTest9 = {1,3,5,7,9};
		q9.findMissingInteger(arrTest9);
		
		//test q10, please provide a full name file
		System.out.println("--Q10 Result:");
		String file =  "C:\\Users\\tianx\\git\\repositoryMarlabs\\Marlabs\\Jun-12\\com\\yi\\hw2\\file.txt";
		try {
			q10.findMostRepeatedWord(file);
		}
		catch(Exception e) {
			
		}
	}
}
