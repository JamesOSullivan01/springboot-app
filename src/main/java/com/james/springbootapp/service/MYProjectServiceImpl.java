package com.james.springbootapp.service;
import com.james.springbootapp.entity.Employee;
import com.james.springbootapp.repository.MyEmployeeRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MYProjectServiceImpl implements MyProjectService{
    @Autowired
    private MyEmployeeRepository myEmployeeRepository;
        //All business logic runs in service Implementation class

    @Override
    public List<Employee> findMaleEmployees() {
        //Getting all employees
        List<Employee>  allEmployees = myEmployeeRepository.findAll();
        allEmployees.get(0).getAddressList();
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
        List<Employee> allData = myEmployeeRepository.findAll();
        allData.stream()
                .forEach(System.out::println);
        return allData;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return myEmployeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return myEmployeeRepository.save(employee);
    }


}
