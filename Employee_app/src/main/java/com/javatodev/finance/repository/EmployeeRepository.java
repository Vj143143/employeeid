package com.javatodev.finance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javatodev.finance.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
