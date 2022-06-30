package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.EmployeeDAO;
import com.example.demo.model.Employee;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeDAO eDAO;
	
	@GetMapping("/employees")
	public List<Employee> getEmployee(){
		return eDAO.getAll();
		
	}
}
