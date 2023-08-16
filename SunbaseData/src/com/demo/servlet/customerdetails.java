package com.demo.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.CustomerDetails;
import com.demo.service.CustomerDetailService;
import com.demo.service.CustomerDetailsImpl;

/**
 * Servlet implementation class customerdetails
 */
@WebServlet("/customerdetails")
public class customerdetails extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String firstName=request.getParameter("fname");
		
		 String lastName=request.getParameter("lname");
		
		 String address=request.getParameter("address");
		
		 String street=request.getParameter("street");
		
		 String city=request.getParameter("city");
		
		 String state=request.getParameter("state");
		
		 String email=request.getParameter("email");
		
		String phone=request.getParameter("phoneno");
				
		CustomerDetails cdls= new CustomerDetails(firstName,lastName,address,street,city,state,email,phone); 
		CustomerDetailService  cds= new CustomerDetailsImpl();
		cds.addCustomerDetails(cdls);
		doGet(request, response);
	}

}
