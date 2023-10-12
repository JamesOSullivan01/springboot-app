package com.james.springbootapp.controller;
import com.james.springbootapp.entity.Employee;
import com.james.springbootapp.service.MyProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.text.ParseException;
import java.util.List;

@RestController
public class MyProjectController {
    @Autowired
    private MyProjectService myProjectService;

    @GetMapping("/get-employee")
    public List<Employee> fetchEmployeeList(){
        return myProjectService.fetchEmployeeList();
    }

    @GetMapping("/find-all-employees")
    public List<Employee> findAllEmployees(){
        return myProjectService.findAllEmployees();
    }

    //Find employee hired before a date and by gender
    @GetMapping("/find-by-date-and-gender")
    public List<Employee> findByDateAndGender() throws ParseException {
        return myProjectService.findByDateAndGender();
    }

    // Find male employees
    @GetMapping("/find-males")
    public List<Employee> findmales(){
        return myProjectService.findMaleEmployees();
    }

    @PostMapping("/save-employee")
    public Employee saveEmployee(@RequestBody Employee employee)
    {
        return myProjectService.saveEmployee(employee);
    }

    @PutMapping("/update-employee")
    public Employee updateEmployee(Employee employee){
        return myProjectService.updateEmployee(employee);
    }

}

// Use Stream API to print all elements in the Employee object.
// Enter more records into DB using postman
//postman is developer tool that we use for development
//
//Use java 8 stream API to filter male employees.
//Use java 8 stream API to filter employees with salaries less than 5000.
//Use java 8 stream API to filter employees with salaries less than 5000 and gender equals Male.
//https://saturncloud.io/blog/what-is-the-difference-between-post-and-put-in-http/#:~:text=Differences%20between%20POST%20and%20PUT,while%20PUT%20requests%20are%20idempotent.
//Hashmaps interview questions
//How spring JPA works?


//