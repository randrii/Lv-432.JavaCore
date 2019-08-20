package com.softserve.collection;

import java.util.Comparator;

public class Employee {

	public static class NameComparator implements Comparator<Employee> {
		public int compare(Employee o1, Employee o2) {
			return o1.getName().compareTo(o2.getName());
		}
	}

	public static class TabComparator implements Comparator<Employee> {
		public int compare(Employee o1, Employee o2) {
			return o1.getTabNumber() - o2.getTabNumber();
		}
	}

	// -----------------------------------------------------------

	private static NameComparator nameComparator = new NameComparator();
	private static TabComparator tabComparator = new TabComparator();

	private int tabNumber;
	private String name;

	public Employee(String name, int tabNumber) {
		this.tabNumber = tabNumber;
		this.name = name;
	}

	public int getTabNumber() {
		return tabNumber;
	}

	public String getName() {
		return name;
	}

	public static Comparator<Employee> getNameComparator() {
		return nameComparator;
	}

	public static Comparator<Employee> getTabComparator() {
		return tabComparator;
	}

	@Override
	public String toString() {
		return "Employee [tabNumber=" + tabNumber + ", name=" + name + "]";
	}
	
}
