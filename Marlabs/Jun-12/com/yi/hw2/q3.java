package com.yi.hw2;

import java.util.Iterator;
import java.util.Map;

public class q3 {
	public static void iterateMapFor(Map<Character, Integer> m) {
		if (m == null) {
			return;
		}
		for (char key : m.keySet()) {
			System.out.println(key +":" +m.get(key));
		}
	}
	public static void iterateMapWhile(Map<Character, Integer> m) {
		if (m == null) {
			return;
		}
		Iterator it = m.keySet().iterator();
		while(it.hasNext()) {
			char c = (char)it.next();
			System.out.println(c + ":" + m.get(c));
		}
	}
}
