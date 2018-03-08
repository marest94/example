package com.spring.app.rest.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.app.rest.services.interfaces.IUserClientService;
import com.spring.app.soap.wsdl.User;

@RestController
@RequestMapping("/users")
@CrossOrigin()
public class UserController {
	
	@Autowired
	IUserClientService userService;
	
	@RequestMapping("/{id}")
	public User getById(@PathVariable int id) {
		return userService.getUserById(id);
	}
	
	@RequestMapping("/all")
	public List<User> getById() {
		User u1 = userService.getUserById(1);
		User u2 = userService.getUserById(2);
		List<User> users = new ArrayList<User>();
		users.add(u1);
		users.add(u2);
		return users;
	}
	
	
}