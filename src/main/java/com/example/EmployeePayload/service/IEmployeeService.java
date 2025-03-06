package com.example.EmployeePayload.service;

import com.example.EmployeePayload.DTO.EmployeeDTO;
import com.example.EmployeePayload.Model.EmployeeData;

import java.util.List;

public interface IEmployeeService {
    public List<EmployeeData> getAllEmployee();
    public EmployeeData getEmployeeById(int id);
    public EmployeeData postEmployee(EmployeeDTO employeeDTO);
    public EmployeeData putEmployee(int id, EmployeeDTO employeeDTO);
    public EmployeeData deleteEmployee(int id);
}
