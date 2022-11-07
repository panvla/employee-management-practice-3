package com.vladimirpandurov.employeemanager3.service;

import com.vladimirpandurov.employeemanager3.model.Employee;
import com.vladimirpandurov.employeemanager3.repo.EmployeeRepo;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class EmployeeService {

    private final EmployeeRepo employeeRepo;


    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }

}
