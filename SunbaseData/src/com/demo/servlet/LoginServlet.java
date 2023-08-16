package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.CustomerDetails;
import com.demo.beans.Login;
import com.demo.service.CustomerDetailService;
import com.demo.service.CustomerDetailsImpl;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		CustomerDetailService customerDetailService=new CustomerDetailsImpl();
		
		List<Login> list=customerDetailService.authentication();
		if(list!=null)
		{
			for(Login login:list)
			{
				if(login.getEmail().equals(email) && login.getPassword().equals(password))
				{
					CustomerDetailService  cds= new CustomerDetailsImpl();
					List<CustomerDetails> custList= cds.getAllCustomerDetails();
					request.setAttribute("custlist", custList);
					RequestDispatcher rd=request.getRequestDispatcher("displayAll.jsp");
					rd.forward(request, response);
				}
				else
				{
					RequestDispatcher rd=request.getRequestDispatcher("registration.html");
					rd.forward(request, response);
				}
			}
				
		}
		

	}

}
