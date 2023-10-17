package com.james.springbootapp.repository;

import com.james.springbootapp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface MyEmployeeRepository extends JpaRepository <Employee, Long> {
    List<Employee> findEmployeeByGenderAndFirstName(Character g, String name);



}
