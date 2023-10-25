package com.james.springbootapp.repository;

import com.james.springbootapp.entity.Licenses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
@Repository
public interface LicensesRepository extends JpaRepository<Licenses, Long> {

}
