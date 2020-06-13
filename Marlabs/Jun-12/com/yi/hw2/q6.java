package com.yi.hw2;

import java.util.HashSet;
import java.util.Set;

public class q6 {
	public static void findDuplicateChar(String str) {
		if (str == null || str.length() == 1) {
			System.out.println("no duplicate");
		}
		Set<Character> s = new HashSet<Character>();
		System.out.println("duplicate: ");
		for (int i = 0; i < str.length(); i++) {
			if (s.contains(str.charAt(i))) {
				System.out.print(str.charAt(i) + " ");
				continue;
			}
			s.add(str.charAt(i));
		}
		System.out.println();
	}
}
