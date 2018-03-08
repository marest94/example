package com.spring.app.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.app.rest.services.interfaces.IUserClientService;
import com.spring.app.soap.wsdl.User;

@RestController
@RequestMapping("/user")
@CrossOrigin()
public class UserController {
	
	@Autowired
	IUserClientService userService;
	
	@RequestMapping("/{id}")
	public User getById(@PathVariable int id) {
		return userService.getUserById(id);
	}
	
}
