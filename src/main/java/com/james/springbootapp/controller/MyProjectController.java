package com.james.springbootapp.controller;
import com.james.springbootapp.entity.Employee;
import com.james.springbootapp.service.MyProjectService;
import org.apache.catalina.util.Introspection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/v1/")
//Controller level. already appended to various mappings
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

//    Find employee by id using path Variable
    @GetMapping("/find-employee/{employee_id}")
    public Employee findById(@PathVariable Integer employee_id){
        Employee employee = myProjectService.findEmployeeById(employee_id);
        return employee;
    }

    @DeleteMapping("/delete-employee/{employee_id}")
    public void deleteEmployee(@PathVariable Integer employee_id){
        myProjectService.deleteEmployeeById(employee_id);
    }

//    Find employee by id using request params
    //Query params
//
//    @GetMapping("/find-employee/")
//    public ResponseEntity<Employee> findById(@RequestParam Integer employee_id) {
//        Employee employee = myProjectService.findEmployeeById(employee_id);
//
//        if (employee != null) {
//            return ResponseEntity.ok(employee);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }


}
//Hashmaps interview questions
//How spring JPA works?


//