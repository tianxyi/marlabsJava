package com.yi.hw2;

public class q4 {
	public static boolean isPalindrome(Object o) {
		if (o == null) {
			return true;
		}
		String str = o.toString();
		char[] strArr = str.toCharArray();
		int left = 0, right = str.length() - 1;
		while (left < right) {
			if (strArr[left] != strArr[right]) {
				return false;
			}
			left++;
			right--;
		}
		
		return true;
	}
}
