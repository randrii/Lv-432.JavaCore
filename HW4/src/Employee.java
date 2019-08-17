import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Employee {
    private String name;
    private int departmentnumber;
    private int salary;

    public Employee(String name, int departmentnumber, int salary) {
        this.name = name;
        this.departmentnumber = departmentnumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartmentnumber() {
        return departmentnumber;
    }

    public void setDepartmentnumber(int departmentnumber) {
        this.departmentnumber = departmentnumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void main(String[] args) throws IOException {
        Employee[] employees = new Employee[4];
        Employee employee1 = new Employee("Andrii", 1, 2000);
        Employee employee2 = new Employee("Alex", 2, 1800);
        Employee employee3 = new Employee("Bill", 3, 4000);
        Employee employee4 = new Employee("Ellie", 2, 1000);

        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        employees[3] = employee4;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter department number: ");
        int dept = Integer.parseInt(bufferedReader.readLine());


        for (Employee employee: employees){
            if (employee.getDepartmentnumber() == dept)
                System.out.println(employee.getName());
        }
        Employee temp;
        for (int i = 0; i <employees.length; i++) {
            for (int j = 0; j < employees.length-1; j++) {
                if (employees[i].getSalary() < employees[j].getSalary()){
                    temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }
        System.out.println("Desc order:");
        for (Employee employee: employees){
            System.out.println(employee.getName()+"\t"+employee.getSalary());
        }
    }
}
