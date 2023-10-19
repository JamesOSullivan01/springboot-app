package com.james.springbootapp.service;

import com.james.springbootapp.entity.Employee;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

public interface MyProjectService {

    //read(get) employee list
   List<Employee> fetchEmployeeList();

   //Find all employess
    List<Employee> findAllEmployees();

    //find male employees
    List<Employee> findMaleEmployees();

   //Save Employee
    Employee saveEmployee(Employee employee);

    //update Employee
    Employee updateEmployee(Employee employee);

    //trying to get the address

    //find employee by ID
    Employee findEmployeeById(Integer employeeId);


}
