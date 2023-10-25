package com.james.springbootapp.service;
import com.james.springbootapp.entity.Employee;
import com.james.springbootapp.repository.MyEmployeeRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MYProjectServiceImpl implements MyProjectService{
    @Autowired
    private MyEmployeeRepository myEmployeeRepository;
        //All business logic runs in service Implementation class

    private static Integer counter = 0;


    @Override
    public List<Employee> findMaleEmployees() {
        //Getting all employees
        List<Employee>  allEmployees = myEmployeeRepository.findAll();
//        allEmployees.get(0).getAddressList();
        //Filtering out male employees
        List<Employee> maleEmployees = allEmployees.stream()
                                                    .filter(m -> m.getGender().equals('m'))
                                                    .collect(Collectors.toList());
        return maleEmployees;
    }

    @Override
    public List<Employee> fetchEmployeeList(){
        List<Employee> data = myEmployeeRepository.findEmployeeByGenderAndFirstName('f', "James1");
        data.stream()
                .forEach(System.out::println);
        return data;
    }

    @Override
    public List<Employee> findAllEmployees(){
        return myEmployeeRepository.findAll();
    }





    @Override
    public Employee saveEmployee(Employee employee) {
       counter++;
        String username = employee.getFirstName() + "." + employee.getLastName() + "." + counter;
        System.out.println("Generated username: " + username);

        employee.setUsername(username);
        return myEmployeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return myEmployeeRepository.save(employee);
    }

    @Override
    public Employee findEmployeeById(Integer employeeId) {
        return myEmployeeRepository.findEmployeeByEmployeeId(employeeId);
    }

    @Override
    @Transactional
    public void deleteEmployeeById(Integer employeeId) {
        myEmployeeRepository.deleteEmployeeByEmployeeId(employeeId);
    }
    //says to DB to get ready to change


}
