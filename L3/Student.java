public class Student {
	private static int sum = 0;
	private static int count = 0;

	private String name;
	private int rait;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRait() {
		return rait;
	}

	public void setRait(int rait) {
		sum = sum - this.rait;
		this.rait = rait;
		sum = sum + rait;
	}

	public Student() {
		count++;
	}

	public Student(String name, int rait) {
		this.name = name;
		this.rait = rait;
		count = count + 1;
		sum = sum + rait;
	}

	public Student(String name) {
		this.name = name;
		count++;
	}

	boolean betterStudent(Student s) {
		return this.getRait() > s.getRait();
	}

	@Override
	public String toString() {
		return "Student (name=" + name + ", rait=" + rait + ")";
	}

	public static double getAvrRait() {
		return sum / (double) count;
	}

}
