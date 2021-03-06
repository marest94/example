package com.spring.app.repositories;


import java.util.Iterator;


import org.springframework.stereotype.Component;

import localhost._8080.soap.Agreement;
import localhost._8080.soap.AgreementsList;

@Component
public class AgreementRepository {

	private AgreementsList agreementsList = new AgreementsList();

	public AgreementRepository(){
		Agreement a1 = new Agreement();
		a1.setUserID(1);
		a1.setAgreementID(1);
		a1.setAgreementType("credit");
		a1.setDate("12.12.2012");
		
		
		Agreement a2 = new Agreement();
		a2.setUserID(1);
		a2.setAgreementID(2);
		a2.setAgreementType("credit");
		a2.setDate("12.12.2012");
		
		
		Agreement a3 = new Agreement();
		a3.setUserID(2);
		a3.setAgreementID(3);
		a3.setAgreementType("credit");
		a3.setDate("12.12.2012");
		
		agreementsList.getAgremeent().add(a1);
		agreementsList.getAgremeent().add(a2);
		agreementsList.getAgremeent().add(a3);
		
		
	}
	
	public Agreement getAgreementById(int agreementID){
		Iterator<Agreement> iterator = agreementsList.getAgremeent().iterator();
		while (iterator.hasNext()) {
			Agreement agreement = iterator.next();
			if (agreement.getAgreementID() == agreementID) {
				return agreement;
			}
		}
		return null;
	}
	
	public AgreementsList getAgreementsList() {
		return  agreementsList;
	}
}
