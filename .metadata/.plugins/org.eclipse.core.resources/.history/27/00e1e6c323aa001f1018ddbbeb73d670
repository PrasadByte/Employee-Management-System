package com.Employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.Employee.Service.EmployeeService;
import com.Employee.entity.Employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeservice;
	
	//API for the Inserting the New Employee
	@PostMapping("/empadd")
	public String insertEmployee(@RequestBody Employee emp) {
		//TODO: process POST request
		employeeservice.createEmployee(emp);
		return "Employee Inserted succeesfully";
		
	}
	//api for the fetch the all Employee
	@GetMapping("/all")
	public List<Employee>fetchEmployee(){
	return	employeeservice.getEmployee();
	}
	// api for fetch perticular employee
	@GetMapping("/getById/{id}")
	public Optional<Employee> fetchById(@PathVariable int id) {
	    return employeeservice.getPerticularEmployee(id);
	}
	
	//api for the update Employee
	@PutMapping("/updateemp{id}")
	public Employee updateEmp (@RequestBody Employee emp) {
		employeeservice.updateEmployee(emp);
		return emp;
	}
	// api for the  employee Login
	@GetMapping("/loginemployee")
	public String loginemp(@RequestParam String email, @RequestParam String password) {
		return employeeservice.loginEmployee(email, password);
	}
	//git testing

}
