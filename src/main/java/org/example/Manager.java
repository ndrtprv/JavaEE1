package org.example;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name, String departmentName, double salary) throws FieldLengthLimitException, IncorrectSalaryException {
        super(name, departmentName, salary);
        this.bonus = 0;
    }

    public Manager(String name, String departmentName, double salary, double bonus) throws FieldLengthLimitException, IncorrectSalaryException {
        super(name, departmentName, salary);
        if (bonus < 0) {
            throw new IncorrectSalaryException("Bonus is smaller than 0!");
        } else {
            this.bonus = bonus;
        }
    }

    public double getBonus() {
        return this.bonus;
    }

    public void printEmployee() {
        System.out.println("ID: " + getId() + ", Name: " + getName() + ", Department: " + getDepartmentName() + ", Salary: " + getSalary() + ", Bonus: " + bonus);
    }
}
