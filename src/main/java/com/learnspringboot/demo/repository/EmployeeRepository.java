package com.learnspringboot.demo.repository;

import com.learnspringboot.demo.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author tamvo
 * @created 09/03/2020 - 10:02 AM
 */

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
