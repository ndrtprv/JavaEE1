package org.example;

public class CompositePatternDemo {
    public static void main(String[] args) throws FieldLengthLimitException, IncorrectSalaryException, EmployeeInRegistryException{
        Registry workers = Registry.getRegistry();

        Manager emp1 = new Manager("Andrii Toporov", "Project Management",2400, 100);
        workers.addEmployee(emp1);

        Employee emp2 = new Employee("Denys Slatvytskiy", "Tech Support Lead", 2000);
        workers.addEmployee(emp2);
        emp2.setManagerId(emp1.getId());

        Employee emp3 = new Employee("Vladyslav Bezruk", "Development Lead",2200);
        workers.addEmployee(emp3);
        emp3.setManagerId(emp1.getId());

        Employee emp4 = new Employee("Yevhen Solovey", "Tech Support", 1800);
        workers.addEmployee(emp4);
        Employee emp5 = new Employee("Dmytro Oliynyk", "Tech Support", 1750);
        workers.addEmployee(emp5);
        emp4.setManagerId(emp2.getId());
        emp5.setManagerId(emp2.getId());

        Employee emp6 = new Employee("Ann Zakharova", "Development", 1960);
        workers.addEmployee(emp6);
        Employee emp7 = new Employee("Vladyslav Bondar", "Development", 2000);
        workers.addEmployee(emp7);
        emp6.setManagerId(emp3.getId());
        emp7.setManagerId(emp3.getId());

        emp1.add(emp2);
        emp1.add(emp3);

        emp2.add(emp4);
        emp2.add(emp5);

        emp3.add(emp6);
        emp3.add(emp7);

        emp1.printEmployee();

        for (Employee headEmployee : emp1.getSubordinates()) {
            headEmployee.printEmployee();
            for (Employee employee : headEmployee.getSubordinates()) {
                employee.printEmployee();
            }
        }
    }
}