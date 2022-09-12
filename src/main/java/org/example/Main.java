package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            Employee emp1 = new Employee("Vlad Bezruk", 2500);
            emp1.printEmployee();
        } catch (FieldLengthLimitException | IncorrectSalaryException e) {
            System.out.println(e.getMessage());
        }
        try {
            Employee emp2 = new Employee("Andrii Serhiyovych Toporov", 2400);
            emp2.printEmployee();
        } catch (FieldLengthLimitException | IncorrectSalaryException e) {
            System.out.println(e.getMessage());
        }
        try {
            Employee emp3 = new Employee("Yevhen Solovey", -100);
            emp3.printEmployee();
        } catch (FieldLengthLimitException | IncorrectSalaryException e) {
            System.out.println(e.getMessage());
        }
    }
}