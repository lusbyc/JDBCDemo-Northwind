package com.jdbcdemo.JDBCDemo;

public class Customers {
	private String customerId;
	private String contactName;
	private String address;
	private String city;
	private String phone;
	
		
	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customers(String customerId, String contactName, String address, String city, String phone) {
		super();
		this.customerId = customerId;
		this.contactName = contactName;
		this.address = address;
		this.city = city;
		this.phone = phone;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Customers [customerId=" + customerId + ", contactName=" + contactName + ", address=" + address
				+ ", city=" + city + ", phone=" + phone + "]";
	}
	
	

}
