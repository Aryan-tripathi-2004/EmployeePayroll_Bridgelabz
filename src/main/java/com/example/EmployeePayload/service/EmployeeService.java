package com.example.EmployeePayload.service;

import com.example.EmployeePayload.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public String getEmployee() {
        return "Employee Details";
    }

    public String getEmployeeById(Long id) {
        return "Employee Details for id: " + id;
    }

    public String postEmployee() {
        return "Employee Added";
    }

    public String putEmployee(Long id) {
        return "Employee Updated for id: " + id;
    }

    public String deleteEmployee(Long id) {
        return "Employee Deleted for id: " + id;
    }

}
