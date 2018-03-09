package com.spring.app.rest.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.app.rest.services.interfaces.IUserClientService;
import com.spring.app.soap.wsdl.User;

@RestController
@RequestMapping("/users")
@CrossOrigin()
public class UserController {
	
	private List<User> users = new ArrayList<User>();
	
	@Autowired
	IUserClientService userService;
	
	@RequestMapping(path = "/add", method = RequestMethod.POST)
	public String add(@RequestBody User u) {
	    users.add(u);  // users list must be added like a property to the controller class, it cant be seen from the controller upper (getUsers controller)
	    return "redirect:all";
	}
	
	@RequestMapping("/remove/{id}")
	public String remove(@PathVariable int id) {
		User u = userService.getUserById(id);
		
		users.remove(u);
		
		return "redirect:all";
	}
	
	/*Purpose of this method is to emulate real answer from server with user array*/
	
	@RequestMapping("/all")
	public List<User> getUsers() {
		User u1 = userService.getUserById(1);
		User u2 = userService.getUserById(2);
		User u3 = userService.getUserById(3);
		User u4 = userService.getUserById(4);
		User u5 = userService.getUserById(5);
		User u6 = userService.getUserById(6);
		User u7 = userService.getUserById(7);
		User u8 = userService.getUserById(8);
		User u9 = userService.getUserById(9);
		users.add(u1);
		users.add(u2);
		users.add(u3);
		users.add(u4);
		users.add(u5);
		users.add(u6);
		users.add(u7);
		users.add(u8);
		users.add(u9);
		
		return users;
	}
	
	
}
