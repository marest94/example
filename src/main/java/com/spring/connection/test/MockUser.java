package com.spring.connection.test;

public class MockUser {

	int id;
	String userName;
	String lastName;
	String ageOfBirth;
	
	public MockUser() {}
	
	public MockUser(int id, String userName, String lastName, String ageOfBirth) {
		super();
		this.id = id;
		this.userName = userName;
		this.lastName = lastName;
		this.ageOfBirth = ageOfBirth;
	}
	public final int getId() {
		return id;
	}
	public final void setId(int id) {
		this.id = id;
	}
	public final String getUserName() {
		return userName;
	}
	public final void setUserName(String userName) {
		this.userName = userName;
	}
	public final String getLastName() {
		return lastName;
	}
	public final void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public final String getAgeOfBirth() {
		return ageOfBirth;
	}
	public final void setAgeOfBirth(String ageOfBirth) {
		this.ageOfBirth = ageOfBirth;
	}
	
}
