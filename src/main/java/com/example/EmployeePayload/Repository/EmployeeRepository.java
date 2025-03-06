package com.example.EmployeePayload.Repository;

import com.example.EmployeePayload.DTO.EmployeeDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeDTO, Long> {
}
