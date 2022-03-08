package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.Department;
import com.example.demo.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired 
	DepartmentRepository departmentRepository;
	
	public Department saveDepartment(Department deparment) {
		return departmentRepository.save(deparment);
	}
	public Department findDepartmentById(@PathVariable("departmentId")int departmentId) {
		return departmentRepository.findByDepartmentId(departmentId);
	}
	

}
