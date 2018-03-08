package com.spring.app.repositories;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;

import localhost._8080.soap.User;

@Component
public class UserRepository {
	private Map<Integer, User> usersMap = new HashMap<Integer, User>();
	
	public UserRepository(){
		User u1 = new User();
		u1.setUserID(1);
		u1.setName("Petar");
		u1.setLastName("Petrovic");
		u1.setYearOfBirth(1995);
		usersMap.put(u1.getUserID(), u1);
		
		User u2 = new User();
		u2.setUserID(2);
		u2.setName("Marko");
		u2.setLastName("Markovic");
		u2.setYearOfBirth(1994);
		usersMap.put(u2.getUserID(), u2);
	}
	
	public User getUser(int userID){
		return usersMap.get(userID);
	}
} 