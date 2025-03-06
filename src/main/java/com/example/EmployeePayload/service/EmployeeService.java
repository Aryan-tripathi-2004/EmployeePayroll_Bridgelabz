package com.example.EmployeePayload.service;

import com.example.EmployeePayload.DTO.EmployeeDTO;
import com.example.EmployeePayload.Model.EmployeeData;
import com.example.EmployeePayload.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<EmployeeData> getAllEmployee() {
        List<EmployeeData> empList = new ArrayList<>();
        empList.add(new EmployeeData(1,new EmployeeDTO("Aryan",100000)));
        return empList;
    }

    public EmployeeData getEmployeeById(int id) {
        return new EmployeeData(1,new EmployeeDTO("kartik",900000));
    }

    public EmployeeData postEmployee(EmployeeDTO employeeDTO) {
        return new EmployeeData(1,employeeDTO);
    }

    public EmployeeData putEmployee(int id,EmployeeDTO employeeDTO) {
        return new EmployeeData(id,employeeDTO);
    }

    public EmployeeData deleteEmployee(int id) {
        return new EmployeeData();
    }

}
