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

    //Find employee by start date and gender
    List<Employee> findByDateAndGender() throws ParseException;

    //find male employees
    List<Employee> findMaleEmployees();

   //Save Employee
    Employee saveEmployee(Employee employee);

    //update Employee
    Employee updateEmployee(Employee employee);




}
