package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.CustomerDetails;
import com.demo.beans.Login;

public class CustomerDetailsDaoImpl implements CustomerDetailsDao
{
	static Connection con;
	static PreparedStatement insertCustomer;
	static PreparedStatement getCustomer;
	static PreparedStatement custDetail;
	static PreparedStatement updatecustDetail;
	static PreparedStatement deleteDetail;
	static PreparedStatement addDetails;
	static PreparedStatement getLoginDetails;
	
	{
		con=DBUtil.getConnection();
		try {
			insertCustomer=con.prepareStatement("insert into CutomerDetails values(?,?,?,?,?,?,?,?)");
			getCustomer=con.prepareStatement("Select * from CutomerDetails");
			custDetail=con.prepareStatement("select * from CutomerDetails where fname=? and lname=?");
			updatecustDetail=con.prepareStatement("update CutomerDetails set address=?,street=?,city=?,state=?,email=?,phoneno=? where fname=? and lname=?");
			deleteDetail=con.prepareStatement("Delete from CutomerDetails where fname=? and lname=?");
			addDetails=con.prepareStatement("insert into Login values(?,?)");
			getLoginDetails=con.prepareStatement("select * from Login");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void addNewCustomerDetails(CustomerDetails cdls) 
	{
		try {
			insertCustomer.setString(1, cdls.getFirstName());
			insertCustomer.setString(2, cdls.getLastName());
			insertCustomer.setString(3, cdls.getAddress());
			insertCustomer.setString(4, cdls.getStreet());
			insertCustomer.setString(5, cdls.getCity());
			insertCustomer.setString(6, cdls.getState());
			insertCustomer.setString(7, cdls.getEmail());
			insertCustomer.setString(8, cdls.getPhone());
			insertCustomer.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<CustomerDetails> fetchAllCustomerDetails() 
	{
		List<CustomerDetails> custlist=new ArrayList<>();
		try {
			ResultSet rs=getCustomer.executeQuery();
			while(rs.next()) {
				custlist.add(new CustomerDetails(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)));
			}
			if(custlist.size()>0)
				return custlist;
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		return null;
	}
	@Override
	public CustomerDetails getCustomerDetails(String fName, String lName) 
	{
			
		try {
			custDetail.setString(1, fName);
			custDetail.setString(2,lName);
			ResultSet rs=custDetail.executeQuery();
			if(rs.next())
			{
				return new CustomerDetails(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public void ChangeCustomerDetails(CustomerDetails cdls)
	{
		
		try {
			updatecustDetail.setString(7, cdls.getFirstName());
			updatecustDetail.setString(8, cdls.getLastName());
			updatecustDetail.setString(1, cdls.getAddress());
			updatecustDetail.setString(2, cdls.getStreet());
			updatecustDetail.setString(3, cdls.getCity());
			updatecustDetail.setString(4, cdls.getState());
			updatecustDetail.setString(5, cdls.getEmail());
			updatecustDetail.setString(6, cdls.getPhone());
			updatecustDetail.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public void removeCustomerDetails(String fName, String lName) 
	{
		try {
			deleteDetail.setString(1, fName);
			deleteDetail.setString(2, lName);
			deleteDetail.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public void addDetails(String email, String password) {
		
		try {
			addDetails.setString(1, email);
			addDetails.setString(2, password);
			addDetails.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	@Override
	public List<Login> authentication() {
		List<Login> llist=new ArrayList<>();
		
		try {
			ResultSet rs=getLoginDetails.executeQuery();
			
			while(rs.next())
			{
				llist.add(new Login(rs.getString(1),rs.getString(2)));
				if(llist.size()>0)
					return llist;
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}

}
