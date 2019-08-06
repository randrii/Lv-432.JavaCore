public class Appl {

	public static void main(String[] args) {
		Student s1 = new Student("vasya", 7);
		Student s2 = new Student("olga");
		s2.setRait(9);
		Student s3 = new Student();
		s3.setName("Igor");
		s3.setRait(3);
		s3.setRait(7);
		s3.setRait(9);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(Student.getAvrRait());
		System.out.println(s1.betterStudent(s2));
	}

}
