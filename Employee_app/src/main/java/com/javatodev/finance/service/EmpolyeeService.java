package com.javatodev.finance.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.javatodev.finance.models.Employee;
import com.javatodev.finance.payload.EmployeeRequest;
import com.javatodev.finance.payload.MessageResponse;

@Component
public interface EmpolyeeService {
	 MessageResponse createEmployee(EmployeeRequest employeeRequest);
	 MessageResponse updateEmployee(Integer employeeId, EmployeeRequest employeeRequest);
	    void deleteEmployee(Integer employeeId);
	    Employee getASingleEmployee(Integer employeeId);
	    List<Employee> getAllEmployee();
}
