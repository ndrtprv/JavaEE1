package org.example;

import java.util.*;

public class Registry {
    private static Registry instance = null;
    private final List<Employee> workers = new LinkedList<>();

    private Registry() {

    }

    public static Registry getRegistry() {
        if (instance == null) {
            instance = new Registry();
        }
        return instance;
    }

    public void addEmployee(Employee emp) throws EmployeeInRegistryException{
        if (workers.size() == 0) {
            workers.add(emp);
        } else {
            for (Employee employee : workers) {
                if (emp.equals(employee)) {
                    throw new EmployeeInRegistryException("This worker is in the list!");
                }
            }
            workers.add(emp);
        }
    }

    public void printList() {
        if (workers.size() != 0) {
            for (Employee emp : workers) {
                emp.printEmployee();
            }
        } else {
            System.out.println("There is no workers!");
        }
    }
}