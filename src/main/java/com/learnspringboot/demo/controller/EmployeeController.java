package com.learnspringboot.demo.controller;

import com.learnspringboot.demo.models.Employee;
import com.learnspringboot.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author tamvo
 * @created 09/03/2020 - 9:59 AM
 */

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping(value = "api/employees", method = RequestMethod.GET)
    public ResponseEntity<Object> getEmployeses(){
        List<Employee> employees = employeeRepository.findAll();
        if (employees == null){
            return ResponseEntity.noContent().build();
        }
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }
}
