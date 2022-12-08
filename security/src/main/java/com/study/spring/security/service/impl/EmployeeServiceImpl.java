package com.study.spring.security.service.impl;

import com.study.spring.security.model.Employee;
import com.study.spring.security.repository.EmployeeRepository;
import com.study.spring.security.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.addEmployee(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }


    @Override
    public void updateEmployee(Employee employee) {

    }

    @Override
    public Optional<Employee> finById(Long id) {
        return employeeRepository.findById(id);
    }

}
