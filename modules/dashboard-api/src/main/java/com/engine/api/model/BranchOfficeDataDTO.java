package com.engine.api.model;

public class BranchOfficeDataDTO {

	private String name;
	private String address;
	private Integer branchOfficeNumber;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Integer getBranchOfficeNumber() {
		return branchOfficeNumber;
	}
	
	public void setBranchOfficeNumber(Integer branchOfficeNumber) {
		this.branchOfficeNumber = branchOfficeNumber;
	}
}
