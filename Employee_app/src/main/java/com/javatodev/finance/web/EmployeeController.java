package com.javatodev.finance.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatodev.finance.models.Employee;
import com.javatodev.finance.payload.EmployeeRequest;
import com.javatodev.finance.payload.MessageResponse;
import com.javatodev.finance.service.EmpolyeeService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
@Autowired
EmpolyeeService employeeService;
@GetMapping("/all")
public ResponseEntity<List<Employee>> getAllEmployees () {
    List<Employee> employees = employeeService.getAllEmployee();
    return new ResponseEntity<>(employees, HttpStatus.OK);
}
@GetMapping("/find/{id}")
public ResponseEntity<Employee> getEmployeeById (@PathVariable("id") Integer id) {
    Employee employee = employeeService.getASingleEmployee(id);
    return new ResponseEntity<>(employee, HttpStatus.OK);
}
@PostMapping("/add")
public ResponseEntity<MessageResponse> addEmployee( @RequestBody EmployeeRequest employee) {
    MessageResponse newEmployee = employeeService.createEmployee(employee);
    return new ResponseEntity<>(newEmployee, HttpStatus.CREATED);
}
@PutMapping("/update/{id}")
public ResponseEntity<MessageResponse> updateEmployee( @PathVariable Integer id, @RequestBody EmployeeRequest employee) {
    MessageResponse updateEmployee = employeeService.updateEmployee(id, employee);
    return new ResponseEntity<>(updateEmployee, HttpStatus.OK);
}
@DeleteMapping("/delete/{id}")
public ResponseEntity<?> deleteEmployee(@PathVariable("id") Integer id) {
    employeeService.deleteEmployee(id);
    return new ResponseEntity<>(HttpStatus.OK);
}

}
