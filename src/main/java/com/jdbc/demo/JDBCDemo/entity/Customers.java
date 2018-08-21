package com.jdbc.demo.JDBCDemo.entity;

public class Customers {
	private String customerID;
	private String companyName;
	private String contactName;
	private String contactTitle;
	private String phone;

	public Customers() {
		customerID = "";
		companyName = "";
		contactName = "";
		contactTitle = "";
		phone = "";
	}

	public Customers(String customerID, String companyName, String contactName, String contactTitle, String phone) {

		this.customerID = customerID;
		this.companyName = companyName;
		this.contactName = contactName;
		this.contactTitle = contactTitle;
		this.phone = phone;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactTitle() {
		return contactTitle;
	}

	public void setContactTitle(String contactTitle) {
		this.contactTitle = contactTitle;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "customerID=" + customerID + ", companyName=" + companyName + ", contactName=" + contactName
				+ ", contactTitle=" + contactTitle + ", phone=" + phone;
	}

}
