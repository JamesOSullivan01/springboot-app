package com.james.springbootapp.repository;

import com.james.springbootapp.entity.Licenses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LicensesRepository extends JpaRepository<Licenses, Long> {
}
