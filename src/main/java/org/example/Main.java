package org.example;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Vlad Bezruk");
        Employee emp2 = new Employee("Andrii Toporov", 2400);
        emp1.printEmployee();
        emp2.printEmployee();
    }
}