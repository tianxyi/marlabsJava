package com.yi.hw2;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class q10 {
	public static void findMostRepeatedWord(String fileName) throws Exception {
		
		//FileInputStream in = null;
		//String filePrefix = "C:\\Users\\tianx\\git\\repositoryMarlabs\\Marlabs\\Jun-12\\com\\yi\\hw2\\";
		//String fileName ="file.txt";
		//String filePath = filePrefix + fileName;
		String line;
		FileReader file = new FileReader(fileName);
		List<String> words  = new ArrayList<>();
		BufferedReader br = new BufferedReader(file);
		while ((line = br.readLine())!= null) {
			String[] strs = line.toLowerCase().split("([,.\\s]+)");
			for (String str : strs) {
			//	System.out.println(str);
				words.add(str);
			}
		}
		br.close();
		if (words.size() == 0) {
			System.out.println("empty file");
		}
		Map<String, Integer> m = new HashMap<>();
		int maxCount = 1;
		for (String str: words) {
			if (m.containsKey(str)) {
				int count = m.get(str);
				m.put(str, ++count);
				maxCount = Math.max(maxCount, count);
				continue;
			}
			m.put(str, 1);
		}
		for (String str: m.keySet()) {
			if (m.get(str) == maxCount) {
				System.out.println(str);
			}
		}
	}
}
