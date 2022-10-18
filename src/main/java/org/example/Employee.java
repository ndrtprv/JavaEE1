package org.example;

public class Employee {
    private final int id;
    private static int nextId = 0;
    private final String name;
    private final double salary;
    public Employee(String name, double salary) throws FieldLengthLimitException, IncorrectSalaryException {
        this.id = nextId++;
        if (name.length() > 20) {
            throw new FieldLengthLimitException("Amount of symbols more than 20!");
        } else {
            this.name = name;
        }
        if (salary <= 0) {
            throw new IncorrectSalaryException("Salary is smaller than or equals 0!");
        } else {
            this.salary = salary;
        }
    }
    public void printEmployee() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}
