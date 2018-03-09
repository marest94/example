package com.spring.app.rest.services.interfaces;

import com.spring.app.soap.wsdl.Agreement;

public interface IAgreementClientService {

	/* Method for getting user from server*/
	Agreement getAgreementById(int id);
}
