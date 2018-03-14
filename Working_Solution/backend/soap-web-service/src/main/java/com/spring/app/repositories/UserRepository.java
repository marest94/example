package com.spring.app.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import localhost._8080.soap.User;
import localhost._8080.soap.UserList;

@Component
public class UserRepository {
	private UserList userList = new UserList();

	public UserRepository() {
		User u1 = new User();
		u1.setUserID(1);
		u1.setName("Petar");
		u1.setLastName("Petrovic");
		u1.setYearOfBirth(1995);
		userList.getUser().add(u1);

		User u2 = new User();
		u2.setUserID(2);
		u2.setName("Marko");
		u2.setLastName("Markovic");
		u2.setYearOfBirth(1994);
		userList.getUser().add(u2);

		User u3 = new User();
		u3.setUserID(3);
		u3.setName("Mile");
		u3.setLastName("Ignjatovic");
		u3.setYearOfBirth(1989);
		userList.getUser().add(u3);

		User u4 = new User();
		u4.setUserID(4);
		u4.setName("Marko");
		u4.setLastName("Stojanovic");
		u4.setYearOfBirth(1994);
		userList.getUser().add(u4);

		User u5 = new User();
		u5.setUserID(5);
		u5.setName("Natasa");
		u5.setLastName("Ljubisavljevic");
		u5.setYearOfBirth(1988);
		userList.getUser().add(u5);

		User u6 = new User();
		u6.setUserID(6);
		u6.setName("Petar");
		u6.setLastName("Stojanovic");
		u6.setYearOfBirth(1994);
		userList.getUser().add(u6);

		User u7 = new User();
		u7.setUserID(7);
		u7.setName("Nikola");
		u7.setLastName("Mojas");
		u7.setYearOfBirth(1994);
		userList.getUser().add(u7);

		User u8 = new User();
		u8.setUserID(8);
		u8.setName("David");
		u8.setLastName("Mojicevic");
		u8.setYearOfBirth(1981);
		userList.getUser().add(u8);

		User u9 = new User();
		u9.setUserID(9);
		u9.setName("Slobodan");
		u9.setLastName("Obradovic");
		u9.setYearOfBirth(1995);
		userList.getUser().add(u9);
	}

	public User getUser(int userID) {
		Iterator<User> iterator = userList.getUser().iterator();
		while (iterator.hasNext()) {
			User user = iterator.next();
			if (user.getUserID() == userID) {
				return user;
			}
		}
		return null;
	}
	
	public UserList getUserList() {
		return userList;
	}
}