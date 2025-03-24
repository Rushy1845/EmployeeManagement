package com.example.dao;

import com.example.model.Employee;
import java.util.List;

public interface IEmployeeDAO {
    void addEmployee(Employee employee);
    Employee getEmployee(int id);
    List<Employee> getAllEmployees();
    void updateSalary(int id, double salary);
    void deleteEmployee(int id);
}
