package com.cih.employeeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cih.employeeservice.entity.Employee;
import com.cih.employeeservice.service.EmployeeService;

@RestController()
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@PostMapping("save")
	public Employee saveEmployee(@RequestBody Employee employee) {

		return employeeService.saveEmployee(employee);
	}

	@DeleteMapping("employee/{id}")
	public void deleteById(@PathVariable Integer id) {

		employeeService.deleteById(id);
	}

	@GetMapping("employee/{id}")
	public Employee getEmployeeById(@PathVariable Integer id) {

		return employeeService.getEmployeeById(id);

	}

	@PutMapping("employee/update")
	public Employee updateEmployee(@RequestBody Employee emp) {

		return employeeService.updateEmployee(emp);
	}

}
