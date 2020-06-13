package com.yi.hw2;

public class q1 {
	public static String reverseString(String str) {
		if (str == null || str.length() <= 1) {
			return str;
		}
		char[] strTemp = str.toCharArray();
		for (int i = 0; i < str.length() / 2; i++) {
	
			swap(strTemp, i, str.length() - 1 - i);
			
		}
//		for (int i = 0; i < str.length(); i++) {
//			System.out.println(strTemp[i]);
//		}
		str = new String(strTemp);
//		for (int i = 0; i < str.length(); i++) {
//			System.out.println(str.charAt(i));
//		}
		return str;
	}
	
	private static void swap(char[] arr, int left, int right) {
		char temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}
}
