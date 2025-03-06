package com.example.EmployeePayload.Repository;

import com.example.EmployeePayload.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
