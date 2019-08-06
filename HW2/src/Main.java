public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("Vasia");
        employee1.setRate(10);
        employee1.setHours(3);

        int employee1Salary = employee1.getSalary();
        double employee1Bonus = employee1.getBonuses();

        Employee employee2 = new Employee("Andrew", 4);
        employee2.setHours(5);
        int employee2Salary = employee2.getSalary();
        double employee2Bonus = employee2.getBonuses();

        Employee employee3 = new Employee("Olga", 8, 10);
        int employee3Salary = employee3.getSalary();
        double employee3Bonus = employee3.getBonuses();

        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
        System.out.println(employee3.toString());

        System.out.println("Total: "+Employee.totalSum);
        employee3.changeRate(30);

        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
        System.out.println(employee3.toString());
        System.out.println("Total1: "+Employee.totalSum);
    }
}
