package com.example.EmployeePayload.Model;

import com.example.EmployeePayload.DTO.EmployeeDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee")
public class EmployeeData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private long salary;

    public EmployeeData(int empId, EmployeeDTO employeeDTO) {
        this.id = empId;
        this.name = employeeDTO.getName();
        this.salary = employeeDTO.getSalary();
    }
}
