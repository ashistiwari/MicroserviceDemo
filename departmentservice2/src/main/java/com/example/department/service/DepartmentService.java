package com.example.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.department.entities.Department;
import com.example.department.repository.DepartmentRepository;
@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentrepository;

	public Department saveDepartment(Department department) {
		
		return departmentrepository.save(department);
	}

	public Department findDepartmentById(Long departmentId) {
		
		return departmentrepository.findByDepartmentId(departmentId);
	}

}
