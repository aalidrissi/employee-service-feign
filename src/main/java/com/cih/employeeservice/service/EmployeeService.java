package com.cih.employeeservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cih.employeeservice.entity.Employee;
import com.cih.employeeservice.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	public Employee saveEmployee(Employee employee) {

		return employeeRepository.save(employee);
	}

	public void deleteById(Integer id) {

		employeeRepository.deleteById(id);
	}

	public Employee getEmployeeById(Integer id) {

		Optional<Employee> opt = employeeRepository.findById(id);

		if (opt.isPresent()) {

			return opt.get();
		}

		return null;
	}

	public Employee updateEmployee(Employee emp) {

		return employeeRepository.save(emp);
	}
}
