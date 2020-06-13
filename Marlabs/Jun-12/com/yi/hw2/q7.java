package com.yi.hw2;

public class q7 {
	public static int findSecondHighestNumber(int[] arr) {
		if (arr == null || arr.length < 2) {
			return Integer.MAX_VALUE;
		}
		int min = Integer.MAX_VALUE, s_min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				s_min = min;
				min = arr[i];
				continue;
			}
			if (arr[i] < s_min) {
				s_min = arr[i];
			}
		}
		return s_min;
	}
	
}
