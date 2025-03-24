package com.example;

import com.example.model.Employee;
import com.example.service.EmployeeService;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        EmployeeService service = new EmployeeService();

        // Adding employees
        service.addEmployee(new Employee(6, "John Doe", "IT", 60000));
        service.addEmployee(new Employee(7, "Jane Smith", "HR", 50000));

        // Fetching an employee
        System.out.println("Employee with ID 1: " + service.getEmployee(1));

        // Fetching all employees
        List<Employee> employees = service.getAllEmployees();
        System.out.println("All Employees: " + employees);

        // Updating salary
        service.updateSalary(1, 65000);

        // Deleting an employee
        service.deleteEmployee(2);
    }
}
