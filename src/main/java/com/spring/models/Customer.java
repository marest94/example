package com.spring.models;

import java.util.List;

public class Customer {
	private int id;
	private String name;
	private String lastName;
	private String address;
	private String phone;
	private List<Agreement> agreements;

	public Customer() {
	}

	public Customer(int id, String name, String lastName, String address, String phone, List<Agreement> agreements) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.address = address;
		this.phone = phone;
		this.setAgreements(agreements);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Agreement> getAgreements() {
		return agreements;
	}

	public void setAgreements(List<Agreement> agreements) {
		this.agreements = agreements;
	}
}
