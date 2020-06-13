package com.yi.hw2;

import java.util.Iterator;
import java.util.List;

public class q5 {
	List list;
	public q5(List list) {
		this.list = list;
	}
	public void iterateListFor() {
		System.out.println("Iterate using for-loop");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	public void iterateListWhile() {
		System.out.println("Iterate using while-loop");
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
	public void iterateListForEach() {
		System.out.println("Iterate using for-each");
		for (Object i : list) {
			System.out.println(i);
		}
		
	}
}
