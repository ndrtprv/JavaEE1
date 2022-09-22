package org.example;

public class Employee {
    private int id;
    private static int nextId = 0;
    private String name;
    private String departmentName;
    private double salary;

    public Employee(String name, String departmentName, double salary) throws FieldLengthLimitException, IncorrectSalaryException {
        this.id = nextId++;
        if (name.length() > 20) {
            throw new FieldLengthLimitException("Amount of symbols more than 20!");
        } else {
            this.name = name;
        }
        if (departmentName.length() > 25) {
            throw new FieldLengthLimitException("Amount of symbols more than 25!");
        } else {
            this.departmentName = departmentName;
        }
        if (salary <= 0) {
            throw new IncorrectSalaryException("Salary is smaller than or equals 0!");
        } else {
            this.salary = salary;
        }
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDepartmentName() {
        return this.departmentName;
    }

    public double getSalary() {
        return this.salary;
    }

    public void printEmployee() {
        System.out.println("ID: " + id + ", Name: " + name + ", Department: " + departmentName + ", Salary: " + salary);
    }
}
