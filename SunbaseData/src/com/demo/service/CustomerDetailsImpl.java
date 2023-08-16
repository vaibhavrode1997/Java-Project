package com.demo.service;

import java.util.List;

import com.demo.beans.CustomerDetails;
import com.demo.beans.Login;
import com.demo.dao.CustomerDetailsDao;
import com.demo.dao.CustomerDetailsDaoImpl;

public class CustomerDetailsImpl implements CustomerDetailService 
{
	private CustomerDetailsDao cddao;
	
	public CustomerDetailsImpl()
	{
		cddao= new  CustomerDetailsDaoImpl();
	}

	@Override
	public void addCustomerDetails(CustomerDetails cdls) 
	{
		cddao.addNewCustomerDetails(cdls);
		
	}

	@Override
	public List<CustomerDetails> getAllCustomerDetails() {
		// TODO Auto-generated method stub
		return cddao.fetchAllCustomerDetails();
	}

	@Override
	public CustomerDetails getCustomerInformation(String fName, String lName) {
		// TODO Auto-generated method stub
		return cddao.getCustomerDetails(fName,lName);
	}

	@Override
	public void UpdateCustomerDetails(CustomerDetails cdls) {
		cddao.ChangeCustomerDetails(cdls);
		
	}

	@Override
	public void deleteCustomerDetail(String fName, String lName)
	{
		cddao.removeCustomerDetails(fName,lName);
		
	}

	@Override
	public void addDetails(String email, String password) {
		cddao.addDetails(email,password);
		
	}

	@Override
	public List<Login> authentication() {
		return cddao.authentication();
		
	}

	
	
}
