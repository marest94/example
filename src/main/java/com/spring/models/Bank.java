package com.spring.models;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	private List<BankAccount> accounts;
	private List<Customer> customers;
	private List<Agreement> agreements;
	
	public Bank() {
		accounts = new ArrayList<>();
		customers = new ArrayList<>();
		agreements = new ArrayList<>();
	}

	public List<BankAccount> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<BankAccount> accounts) {
		this.accounts = accounts;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public List<Agreement> getAgreements() {
		return agreements;
	}

	public void setAgreements(List<Agreement> agreements) {
		this.agreements = agreements;
	}	
}
