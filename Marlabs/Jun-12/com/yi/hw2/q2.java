package com.yi.hw2;

import java.util.HashMap;
import java.util.Map;

public class q2 {
	static public Map<Character, Integer> countTheNumberOfWords(String str) {
		Map<Character, Integer> m = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (m.containsKey(str.charAt(i))) {
				int count = m.get(str.charAt(i));
				m.put(str.charAt(i), ++count);
				continue;
			}
			m.put(str.charAt(i), 1);
		}
		return m;
	}
}
