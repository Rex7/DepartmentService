package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>{
	
	
	 Department findByDepartmentId( int  departmentId);
	

}
