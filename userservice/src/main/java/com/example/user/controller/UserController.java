package com.example.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.entity.User;
import com.example.user.responsetemplate.ResponseTemplate;
import com.example.user.services.UserServices;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserServices userServices;
	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		
		return userServices.saveUser(user);
	}
	@GetMapping("/{id}")
	public ResponseTemplate getUserWithDepartment(@PathVariable("id") Long userId) {
		
		return userServices.getUserWithDepartment(userId);
	}
	
}
