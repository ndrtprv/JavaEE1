package org.example;

import java.util.*;

public class Employee {
    private int id;
    private int managerId;
    private static int nextId = 0;
    private String name;
    private String departmentName;
    private double salary;
    private List<Employee> subordinates;

    public Employee(String name, String departmentName, double salary) throws FieldLengthLimitException, IncorrectSalaryException {
        this.id = nextId++;
        if (name.length() > 30) {
            throw new FieldLengthLimitException("Amount of symbols more than 30!");
        } else {
            this.name = name;
        }
        if (departmentName.length() > 30) {
            throw new FieldLengthLimitException("Amount of symbols more than 30!");
        } else {
            this.departmentName = departmentName;
        }
        if (salary <= 0) {
            throw new IncorrectSalaryException("Salary is smaller than or equals 0!");
        } else {
            this.salary = salary;
        }
        subordinates = new LinkedList<Employee>();
    }

    public int getId() {
        return this.id;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public int getManagerId() {
        return managerId;
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

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public void add(Employee emp) {
        subordinates.add(emp);
    }

    public void remove(Employee emp) {
        subordinates.remove(emp);
    }

    public void printEmployee() {
        System.out.println("ID: " + id + ", Name: " + name + ", Department: " + departmentName + ", Salary: " + salary + ", Manager's ID: " + managerId);
    }
}
