package com.softserve.rybka.HW5;

import java.util.Arrays;
import java.util.Collections;

public class Task2 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new SalariedEmployee(1, "Alex", 11, 10, 300);
        employees[1] = new ContractEmployee(2, "Ann", 21, 2000);
        employees[2] = new SalariedEmployee(3, "Mark", 12, 50, 150);
        employees[3] = new SalariedEmployee(4, "Ellie", 13, 100, 20);
        employees[4] = new ContractEmployee(5, "Bill", 22, 3500);

        Employee temp;
        for (int i = 0; i < employees.length; i++) {
            for (int j = i+1; j < employees.length; j++) {
                if(((Calculable) employees[i]).calculatePay() < ((Calculable) employees[j]).calculatePay()) {
                    temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }

        for (Employee employee : employees){
            System.out.println(employee.getEmployeeId()+"\t"+employee.getName()+"\t"+((Calculable) employee).calculatePay());
        }
    }
}

interface Calculable {
    int calculatePay();
}

class Employee{
    private int employeeId;
    private String name;

    Employee(int id, String name){
        employeeId = id;
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

class SalariedEmployee extends Employee implements Calculable{

    private int socialSecurityNumber;
    private int hourlyRate;
    private int numberHoursWorked;

    public SalariedEmployee(int id, String name, int socialSecurityNumber, int hourlyRate, int numberHoursWorked) {
        super(id, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyRate = hourlyRate;
        this.numberHoursWorked = numberHoursWorked;
    }

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(int socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getNumberHoursWorked() {
        return numberHoursWorked;
    }

    public void setNumberHoursWorked(int numberHoursWorked) {
        this.numberHoursWorked = numberHoursWorked;
    }

    @Override
    public int calculatePay() {
        return hourlyRate * numberHoursWorked;
    }


}

class ContractEmployee extends Employee implements Calculable {

    private int federalTaxIdMember;
    private int fixedMonthlyPayment;

    public ContractEmployee(int id, String name, int federalTaxIdMember, int fixedMonthlyPayment) {
        super(id, name);
        this.federalTaxIdMember = federalTaxIdMember;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public int getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(int federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public int getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(int fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public int calculatePay() {
        return fixedMonthlyPayment;
    }
}