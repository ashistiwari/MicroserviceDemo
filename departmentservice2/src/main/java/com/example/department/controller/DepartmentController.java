package com.example.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.department.entities.Department;
import com.example.department.service.DepartmentService;



@RestController
@RequestMapping("/departments")

public class DepartmentController  {
	@Autowired
	private DepartmentService departmentservice;
	@PostMapping("/")
	
	public Department saveDepartment(@RequestBody Department department)
	{
		

		return departmentservice.saveDepartment(department);
	}
	@GetMapping("/{id}")
	public Department findDepartmentById(@PathVariable("id") Long departmentId)
	{
		return departmentservice.findDepartmentById(departmentId);
	}

}
