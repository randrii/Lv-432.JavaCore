package com.softserve.collection;

import java.util.ArrayList;
import java.util.List;

public class FindDups {
	public static void main(String[] args) {
		//Set<String> s = new HashSet<>();
		List<String> s = new ArrayList<>();
		for (int i = 0; i < args.length; i++) {
			if (!s.add(args[i])) {
				System.out.println("Duplicate detected: " + args[i]);
			}
		}
		System.out.println(s.size() + " distinct words detected: " + s);
	}
}
