package com.example.EmployeePayload.controller;

import com.example.EmployeePayload.DTO.EmployeeDTO;
import com.example.EmployeePayload.DTO.ResponseDTO;
import com.example.EmployeePayload.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping({"","/","/get"})
    public ResponseEntity<ResponseDTO> getEmployee() {
        return ResponseEntity.ok(new ResponseDTO("Employee Details", employeeService.getAllEmployee()));
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<ResponseDTO> getEmployeeById(@PathVariable int id) {
        return ResponseEntity.ok(new ResponseDTO("Employee Details for id: " + id, employeeService.getEmployeeById(id)));
    }

    @PostMapping("/post")
    public ResponseEntity<ResponseDTO> postEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return ResponseEntity.ok(new ResponseDTO("Employee Added", employeeService.postEmployee(employeeDTO)));
    }

    @PutMapping("/put/{id}")
    public ResponseEntity<ResponseDTO> putEmployee(@PathVariable int id,@RequestBody EmployeeDTO employeeDTO) {
        return ResponseEntity.ok(new ResponseDTO("Employee Updated for id: " + id, employeeService.putEmployee(id,employeeDTO)));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDTO> deleteEmployee(@PathVariable int id) {
        return ResponseEntity.ok(new ResponseDTO("Employee Deleted for id: " + id, employeeService.deleteEmployee(id)));
    }
}
