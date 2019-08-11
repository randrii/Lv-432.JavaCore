
public class HomeWork2 {

	public static void main(String[] args) {
		Person p1 = new Person("Ivan", "Ivanov");
		Person p2 = new Person("Petro", "Petrov");
		Person p3 = new Person("Igor", "Igorov");
		Person p4 = new Person("Taras", "Shevchenko");
		Person p5 = new Person("Ivan", "Franko");
		
		p1.output();
		p1.input("", "", -1);
		p1.output();
		p1.changeName("Mykola", "Mykolaenkov");
		p1.output();
		System.out.println("----------------");
		p2.output();
		p2.input("", "", 2010);
		p2.output();
		System.out.println("----------------");
		p3.output();
		p3.input("Lesa", "Ukrainka", 2010);
		p3.output();
		System.out.println("----------------");
		p4.output();
		p4.setBirthYear(2008);
		p4.output();
		System.out.println("----------------");
		p5.output();
		p5.input("Mykhailo", "Stelmakh", 2000);
		p5.output();
		
	}
}
