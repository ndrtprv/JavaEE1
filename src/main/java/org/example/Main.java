package org.example;

public class Main {
    public static void main(String[] args) throws FieldLengthLimitException, IncorrectSalaryException, EmployeeInRegistryException{
        Registry workers = Registry.getRegistry();

        workers.printList();

        Employee emp1 = new Employee("Vlad Bezruk", "Development",2500);

        workers.addEmployee(emp1);
        workers.printList();

        Employee emp2 = new Manager("Andrii Toporov", "Project Management",2400, 100);

        workers.addEmployee(emp2);
        workers.printList();

        try { // Перевірка роботи EmployeeInRegistryException
            workers.addEmployee(emp2);
        } catch (EmployeeInRegistryException e) {
            System.out.println(e.getMessage());
        }

        try { // Перевірка роботи FieldLengthLimitException
            Employee emp3 = new Employee("Denys Eduardovych Slatvytskiy", "Tech Support",1100);
            emp3.printEmployee();
            workers.addEmployee(emp3);
        } catch (FieldLengthLimitException | IncorrectSalaryException | EmployeeInRegistryException e) {
            System.out.println(e.getMessage());
        }

        try { // Перевірка роботи IncorrectSalaryException для зарплати
            Employee emp4 = new Manager("Yevhen Solovey", "QA",0);
            emp4.printEmployee();
            workers.addEmployee(emp4);
        } catch (FieldLengthLimitException | IncorrectSalaryException | EmployeeInRegistryException e) {
            System.out.println(e.getMessage());
        }

        try { // Перевірка роботи IncorrectSalaryException для бонусу
            Employee emp5 = new Manager("Ann Zakharova", "HR",10, -10);
            emp5.printEmployee();
            workers.addEmployee(emp5);
        } catch (FieldLengthLimitException | IncorrectSalaryException | EmployeeInRegistryException e) {
            System.out.println(e.getMessage());
        }
    }
}