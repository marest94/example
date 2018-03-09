package com.spring.app.repositories;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import localhost._8080.soap.Agreement;

@Component
public class AgreementRepository {
private Map<Integer, Agreement> agreementMap = new HashMap<Integer, Agreement>();
	
	public AgreementRepository(){
		Agreement a1 = new Agreement();
		a1.setUserID(1);
		a1.setAgreementID(1);
		a1.setAgreementType("credit");
		a1.setDate("12.12.2012");
		agreementMap.put(a1.getAgreementID(), a1);
		
		Agreement a2 = new Agreement();
		a2.setUserID(1);
		a2.setAgreementID(2);
		a2.setAgreementType("credit");
		a2.setDate("12.12.2012");
		agreementMap.put(a2.getAgreementID(), a2);
		
		Agreement a3 = new Agreement();
		a3.setUserID(2);
		a3.setAgreementID(3);
		a3.setAgreementType("credit");
		a3.setDate("12.12.2012");
		agreementMap.put(a3.getAgreementID(), a3);
	}
	
	public Agreement getAgreement(int agreementID){
		return agreementMap.get(agreementID);
	}
}
