package com.softserve.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.softserve.collection.Employee.TabComparator;

public class Apll5 {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		//
		list.add(new Employee("Vasya", 15));
		list.add(new Employee("Anna", 2));
		list.add(new Employee("Alina", 40));
		//
		System.out.println("NameComparator: ");
		//list.sort(Employee.getNameComparator());
		list.sort(new Employee.NameComparator());
		for (Employee employee : list) {
			System.out.println(employee);
		}
		//
		System.out.println("TabComparator: ");
		//list.sort(new TabComparator());
		Collections.sort(list, new TabComparator());
		for (Employee employee : list) {
			System.out.println(employee);
		}
		//
		Set<Employee> set = new TreeSet<>(Employee.getNameComparator());
		set.add(new Employee("Vasya", 15));
		set.add(new Employee("Anna", 2));
		set.add(new Employee("Alina", 40));
		System.out.println("\nResult: " + set);
		//
		Map<String, String> mapA = new HashMap<>();
		mapA.put("key1", "one");
		mapA.put("key2", "two");
		mapA.put("key3", "three");
		//
		for (Map.Entry<String, String> entry : mapA.entrySet()) {
		    //System.out.println("key= " + entry.getKey() 
		    //		+ "   val= " + entry.getValue());
			System.out.println("key= " + entry.getKey()
					+ "   val= " + mapA.get(entry.getKey()));
		}


	}

}
