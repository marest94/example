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
		
		User u3 = new User();
		u3.setUserID(3);
		u3.setName("Mile");
		u3.setLastName("Ignjatovic");
		u3.setYearOfBirth(1989);
		usersMap.put(u3.getUserID(), u3);
		
		User u4 = new User();
		u4.setUserID(4);
		u4.setName("Marko");
		u4.setLastName("Stojanovic");
		u4.setYearOfBirth(1994);
		usersMap.put(u4.getUserID(), u4);
		
		User u5 = new User();
		u5.setUserID(5);
		u5.setName("Natasa");
		u5.setLastName("Ljubisavljevic");
		u5.setYearOfBirth(1988);
		usersMap.put(u5.getUserID(), u5);
		
		User u6 = new User();
		u6.setUserID(6);
		u6.setName("Petar");
		u6.setLastName("Stojanovic");
		u6.setYearOfBirth(1994);
		usersMap.put(u6.getUserID(), u6);
		
		User u7 = new User();
		u7.setUserID(7);
		u7.setName("Nikola");
		u7.setLastName("Mojas");
		u7.setYearOfBirth(1994);
		usersMap.put(u7.getUserID(), u7);
		
		User u8 = new User();
		u8.setUserID(8);
		u8.setName("David");
		u8.setLastName("Mojicevic");
		u8.setYearOfBirth(1981);
		usersMap.put(u8.getUserID(), u8);
		
		User u9 = new User();
		u9.setUserID(9);
		u9.setName("Slobodan");
		u9.setLastName("Obradovic");
		u9.setYearOfBirth(1995);
		usersMap.put(u9.getUserID(), u9);
	}
	
	public User getUser(int userID){
		return usersMap.get(userID);
	}
} 