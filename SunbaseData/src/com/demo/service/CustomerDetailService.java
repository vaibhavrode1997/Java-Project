package com.demo.service;

import java.util.List;

import com.demo.beans.CustomerDetails;
import com.demo.beans.Login;

public interface CustomerDetailService 
{

	void addCustomerDetails(CustomerDetails cdls);

	List<CustomerDetails> getAllCustomerDetails();

	CustomerDetails getCustomerInformation(String fName, String lName);

	void UpdateCustomerDetails(CustomerDetails cdls);

	void deleteCustomerDetail(String fName, String lName);

	void addDetails(String email, String password);

	List<Login> authentication();
	
}
