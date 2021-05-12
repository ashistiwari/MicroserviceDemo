package com.example.user.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.user.VO.Department;
import com.example.user.entity.User;
import com.example.user.repository.UserRepository;
import com.example.user.responsetemplate.ResponseTemplate;

@Service
public class UserServices {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		
		return userRepository.save(user);
	}

	public ResponseTemplate getUserWithDepartment(Long userId) {
		ResponseTemplate vo=new ResponseTemplate();
		User user=userRepository.findByUserId(userId);
		Department department=restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+user.getDepartmentId()	, Department.class);
		vo.setUser(user);
		vo.setDepartment(department);
		
		
		return vo;
	}
	
	

}
