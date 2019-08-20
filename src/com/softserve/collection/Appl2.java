package com.softserve.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Appl2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(15);
		for (int i = 0; i < 20; i++) {
			list.add(null);
		}
		list.add("First element");
		list.add("Second element");
//		for (String s : list) {
//			System.out.println("element: " + s);
//		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println("i= " + i + "  element: " + list.get(i));
		}
		//
		list.add(0, "One more first element");
		list.set(2, "hahaha");
		list.add(10, "Pos10");
		list.add(11, "Pos10");
		System.out.println("list.get(1): " + list.get(1));
//		for (String s : list) {
//			System.out.println("element: " + s);
//		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println("i= " + i + "  element: " + list.get(i));
		}
		//
		//list.remove(10);
		while (list.remove("Pos10"));
		//list.remove("Pos10");
		//list.remove("Pos10");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\telement = " + element);
		}
		String s1 = new String("acb");
		String s2 = new String("abc");
		System.out.println("hash s1 = " + s1.hashCode());
		System.out.println("hash s2 = " + s2.hashCode());
	}
}
