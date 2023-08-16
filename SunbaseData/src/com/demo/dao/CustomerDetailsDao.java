package com.demo.dao;

import java.util.List;

import com.demo.beans.CustomerDetails;
import com.demo.beans.Login;

public interface CustomerDetailsDao 
{

	void addNewCustomerDetails(CustomerDetails cdls);

	List<CustomerDetails> fetchAllCustomerDetails();

	CustomerDetails getCustomerDetails(String fName, String lName);

	void ChangeCustomerDetails(CustomerDetails cdls);

	void removeCustomerDetails(String fName, String lName);

	void addDetails(String email, String password);

	List<Login> authentication();

}
