package com.study.spring.security.controller;

import com.study.spring.security.model.Employee;
import com.study.spring.security.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/employees")
public class EmployeeController {
    @Autowired
    private final EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<List<Employee>> getEmployees(){
        return ResponseEntity.ok(employeeService.getAllEmployees());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Employee>> getEmployee(@PathVariable Long id){
        return ResponseEntity.ok(employeeService.finById(id));
    }
}
