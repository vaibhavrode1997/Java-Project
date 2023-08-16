package com.demo.beans;

public class CustomerDetails
{
	private String FirstName;
	
	private String LastName;
	
	private String Address;
	
	private String Street;
	
	private String City;
	
	private String State;
	
	private String Email;
	
	private String Phone;
	

	public CustomerDetails() {
		super();
	}


	public CustomerDetails(String firstName, String lastName, String address, String street, String city, String state,
			String email, String phone) 
	{
		super();
		FirstName = firstName;
		LastName = lastName;
		Address = address;
		Street = street;
		City = city;
		State = state;
		Email = email;
		Phone = phone;
	}


	public String getFirstName() {
		return FirstName;
	}


	public void setFirstName(String firstName) {
		FirstName = firstName;
	}


	public String getLastName() {
		return LastName;
	}


	public void setLastName(String lastName) {
		LastName = lastName;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	public String getStreet() {
		return Street;
	}


	public void setStreet(String street) {
		Street = street;
	}


	public String getCity() {
		return City;
	}


	public void setCity(String city) {
		City = city;
	}


	public String getState() {
		return State;
	}


	public void setState(String state) {
		State = state;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public String getPhone() {
		return Phone;
	}


	public void setPhone(String phone) {
		Phone = phone;
	}
	
	
	
	
	
}
