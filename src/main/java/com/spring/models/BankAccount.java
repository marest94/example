package com.spring.models;

public class BankAccount {
	private int id;
	private Customer customer;
	private Agreement agreement;
	private String info;
	private double balance;
	private boolean isBlocked;
	private String blockInfo;

	public BankAccount() {
	}

	public BankAccount(int id, Customer customer, Agreement agreement, String info, double balance) {
		super();
		this.id = id;
		this.customer = customer;
		this.agreement = agreement;
		this.info = info;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Agreement getAgreement() {
		return agreement;
	}

	public void setAgreement(Agreement agreement) {
		this.agreement = agreement;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean isBlocked() {
		return isBlocked;
	}

	public void setBlocked(boolean isBlocked) {
		this.isBlocked = isBlocked;
	}

	public String getBlockInfo() {
		return blockInfo;
	}

	public void setBlockInfo(String blockInfo) {
		this.blockInfo = blockInfo;
	}

}
