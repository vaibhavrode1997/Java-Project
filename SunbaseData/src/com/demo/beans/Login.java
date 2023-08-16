package com.demo.beans;

public class Login {

	private String email;
	private String password;
	
	//parameterless constructor
	public Login() {
		super();
		
	}

	//parametrized constructor
	public Login(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	//getters And setters
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
