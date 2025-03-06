package com.example.EmployeePayload.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping({"","/","/get"})
    public ResponseEntity<String> getEmployee() {
        return ResponseEntity.ok("Employee Details");
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<String> getEmployeeById(@PathVariable Long id) {
        return ResponseEntity.ok("Employee Details for id: " + id);
    }

    @PostMapping("/post")
    public ResponseEntity<String> postEmployee() {
        return ResponseEntity.ok("Employee Added");
    }

    @PutMapping("/put/{id}")
    public ResponseEntity<String> putEmployee(@PathVariable Long id) {
        return ResponseEntity.ok("Employee Updated for id: " + id);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable Long id) {
        return ResponseEntity.ok("Employee Deleted for id: " + id);
    }
}
