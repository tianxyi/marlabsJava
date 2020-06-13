package com.yi.hw2;

import java.util.Arrays;

public class q8 {
	public static String removeWhiteSpace(String str) {
		String[] arr = str.split(" ");
		String r = arr[0];
		for (int i = 1; i < arr.length;i ++) {
			r += arr[i];
		}
		return r;
	}
}
