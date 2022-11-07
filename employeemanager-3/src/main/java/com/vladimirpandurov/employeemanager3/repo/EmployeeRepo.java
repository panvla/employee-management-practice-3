package com.vladimirpandurov.employeemanager3.repo;

import com.vladimirpandurov.employeemanager3.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
