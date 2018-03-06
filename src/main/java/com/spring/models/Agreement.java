package com.spring.models;

import java.util.Date;

public class Agreement {
	private int id;
	private String type;
	private String details;
	private Date agreementStart;
	private Date agreementEnd;
	
	public Agreement() {}

	public Agreement(int id, String type, String details, Date agreementStart, Date agreementEnd) {
		super();
		this.id = id;
		this.type = type;
		this.details = details;
		this.agreementStart = agreementStart;
		this.agreementEnd = agreementEnd;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Date getAgreementStart() {
		return agreementStart;
	}

	public void setAgreementStart(Date agreementStart) {
		this.agreementStart = agreementStart;
	}

	public Date getAgreementEnd() {
		return agreementEnd;
	}

	public void setAgreementEnd(Date agreementEnd) {
		this.agreementEnd = agreementEnd;
	}

}
