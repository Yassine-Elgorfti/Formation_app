package com.example.demo.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@Service
public class EmployeeService {
private final EmployeeRepository employeeRepository;
@Autowired
public EmployeeService(EmployeeRepository employeeRepository){
    this.employeeRepository= employeeRepository;
}
public List<Employee> getEmployees(){
    return employeeRepository.findAll();
    }

}
