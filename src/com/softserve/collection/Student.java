package com.softserve.collection;

//public class Student implements Comparable {
public class Student implements Comparable<Student> {
	private int number;
	private String name;

	public Student(int number, String name) {
		this.number = number;
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	@Override
//	public int compareTo(Object obj) {
//        //return name.compareTo(((Student)obj).name);
//		return number - ((Student)obj).number;
//     }

	@Override
	public int compareTo(Student obj) {
        return name.compareTo(obj.name);
		//return number - obj.number;
     }
	
	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + "]";
	}
	
}
