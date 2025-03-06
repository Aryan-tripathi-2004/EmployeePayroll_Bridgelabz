package com.example.EmployeePayload.Repository;

import com.example.EmployeePayload.Model.EmployeeData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeData, Long> {
}
