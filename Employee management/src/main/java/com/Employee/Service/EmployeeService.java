package com.Employee.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employee.Repository.EmployeeRepository;
import com.Employee.entity.Employee;

@Service
public class EmployeeService {
	@Autowired
	//Employee created first time
	private  EmployeeRepository employeerepo;
	public void createEmployee(Employee emp) {
		employeerepo.save(emp);
	}
	
	//Retrive the all employee from database
	
	public List<Employee> getEmployee(){
		return employeerepo.findAll();
	}
	//Get perticular user Details
	
	public Optional<Employee> getPerticularEmployee(int id) {
		return employeerepo.findById(id);
	}
	//delete the employee vis the Id
	public void deleteemployee(int id) {
		employeerepo.deleteById(id);
	}
	//update the Employee
	
	public void updateEmployee(Employee emp) {
		employeerepo.save(emp);
	}
	
	//Delete all employee
	public void deleteAllEmployee() {
		employeerepo.deleteAll();
	}
	
	//Login Emplyee Logic
	
	public String loginEmployee(String email, String password) {
	    List<Employee> emp = employeerepo.findAll(); // Fetch all employees
	    for (Employee ul : emp) {
	        // Check if the email and password match
	        if (ul.getEmail().equals(email) && ul.getPassword().equals(password)) {
	            return "Employee login successfully";
	        }
	    }
	    // If no match is found after the loop
	    return "Invalid email or password";
	}

	 
}
