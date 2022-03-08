package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Department;
import com.example.demo.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

	@Autowired
	DepartmentService departmentService;
	
	@PostMapping("/")
	public Department saveDepartment( Department department) {
		
		Department demo= departmentService.saveDepartment(department);
		return demo;
	}
	
	@GetMapping("/{id}")
	public Department getDepartmentById(@PathVariable("id") int departmentId) {
		Department demo=  departmentService.findDepartmentById(departmentId);
		return demo;
	}
}
