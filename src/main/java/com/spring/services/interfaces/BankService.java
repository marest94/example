package com.spring.services.interfaces;

import java.util.List;

import com.spring.models.Agreement;

public interface BankService {
	public List<Agreement> getAllAgreementsForCustomer(int customerID);
	
}
