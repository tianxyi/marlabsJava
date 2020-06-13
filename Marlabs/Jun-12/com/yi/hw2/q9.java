package com.yi.hw2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class q9 {
	public static void findMissingInteger(int[] arr) {
		if (arr == null || arr.length <= 1) {
			System.out.println("no missing Integer");
		}
		Arrays.sort(arr);
		int start = arr[0], end = arr[arr.length - 1];
		Set<Integer> set = new HashSet<Integer>();
		for (int i = start; i <= end; i++) {
			set.add(i);
		}
		Set<Integer> arrSet = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			arrSet.add(arr[i]);
		}
		set.removeAll(arrSet);
		for (int num : set) {
			System.out.print(num+" ");
		}
	}
}
