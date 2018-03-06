package com.spring.services;

import java.util.List;

import com.spring.models.Agreement;
import com.spring.models.Bank;
import com.spring.models.Customer;
import com.spring.services.interfaces.BankService;

public class BankServiceImpl implements BankService {
	
	private Bank bank;

	/* Shows all of the agreements for a single customer (customerID) */
	@Override
	public List<Agreement> getAllAgreementsForCustomer(int customerID) {
		List<Customer> customers = bank.getCustomers();
		
		Customer c = customers.stream().filter(customer -> customerID == customer.getId()).findFirst().orElse(null);
		
		return c.getAgreements();
	}

	
}
