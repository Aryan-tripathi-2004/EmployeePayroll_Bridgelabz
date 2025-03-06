package com.example.EmployeePayload.service;

import com.example.EmployeePayload.DTO.EmployeeDTO;
import com.example.EmployeePayload.Model.EmployeeData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {

    private List<EmployeeData> empList = new ArrayList<>();

    public List<EmployeeData> getAllEmployee() {
        return empList;
    }

    public EmployeeData getEmployeeById(int id) {
        for(EmployeeData emp : empList){
            if(emp.getId() == id){
                return emp;
            }
        }
        return new EmployeeData(-1,new EmployeeDTO("Jane Doe",000000));
    }

    public EmployeeData postEmployee(EmployeeDTO employeeDTO) {
        empList.add(new EmployeeData(empList.size()+1,employeeDTO));
        return empList.getLast();
    }

    public EmployeeData putEmployee(int id,EmployeeDTO employeeDTO) {
        for(EmployeeData emp : empList){
            if(emp.getId() == id){
                emp.setName(employeeDTO.getName());
                emp.setSalary(employeeDTO.getSalary());
                return emp;
            }
        }
        return new EmployeeData(-1,new EmployeeDTO("Jane Doe",000000));
    }

    public EmployeeData deleteEmployee(int id) {
        if(empList.size() >= id) return empList.remove(id-1);
        return new EmployeeData(-1,new EmployeeDTO("Jane Doe",000000));
    }

}
