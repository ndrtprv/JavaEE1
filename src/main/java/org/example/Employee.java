package org.example;

public class Employee {
    private int id;
    private static int nextId = 0;
    private String name;
    private double salary;
    public Employee(String name) {
        this.id = nextId++;
        this.name = name;
    }
    public Employee(String name, double salary) {
        this.id = nextId++;
        this.name = name;
        this.salary = salary;
    }
    public void printEmployee() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}
