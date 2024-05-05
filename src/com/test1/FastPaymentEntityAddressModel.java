package com.test1;

public class FastPaymentEntityAddressModel {
	private Integer fastPaymentKey;
	private String countryCode;
	private String branchInfo;
	private String city;
	private String state;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public FastPaymentEntityAddressModel() {

	}

	public FastPaymentEntityAddressModel(Integer fastPaymentKey, String countryCode, String branchInfo, String city,
			String state, String creationDate, String modifiedDate, String entityState) {
		super();
		this.fastPaymentKey = fastPaymentKey;
		this.countryCode = countryCode;
		this.branchInfo = branchInfo;
		this.city = city;
		this.state = state;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getFastPaymentKey() {
		return fastPaymentKey;
	}

	public void setFastPaymentKey(Integer fastPaymentKey) {
		this.fastPaymentKey = fastPaymentKey;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getBranchInfo() {
		return branchInfo;
	}

	public void setBranchInfo(String branchInfo) {
		this.branchInfo = branchInfo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
