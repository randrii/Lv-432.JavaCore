
import java.time.Year;

public class Person {
	private String firstName;
	private String lastName;
	private int birthYear = Year.now().getValue();
	private static int currYear = Year.now().getValue();
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Person() {}
	public int getAge() {
		return currYear - birthYear;
	}
	public void input(String fn, String ln, int br) {
		if(fn.length()==0) {
			firstName = firstName;
		} else {
		firstName = fn;}
		if(ln.length() == 0) {
			lastName = lastName;
		} else {
		lastName = ln;}
		if(br < 0) {
			br = Year.now().getValue();
		} else {
		birthYear = br;}
	}
	public void output() {
		System.out.println("First name is " + firstName + ", last name is " + lastName + ", age is " + getAge());
	}
	public void changeName(String fn, String ln) {
		if(fn.length()==0) {
			firstName = firstName;
		} else {
		firstName = fn;}
		if(ln.length() == 0) {
			lastName = lastName;
		} else {
		lastName = ln;}
	}
	public void setBirthYear(int br) {
		if(br < 0) {
			br = Year.now().getValue();
		} else {
		birthYear = br;}
	}
}
