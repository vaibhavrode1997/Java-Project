package com.demo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.service.CustomerDetailService;
import com.demo.service.CustomerDetailsImpl;

/**
 * Servlet implementation class delete1
 */
@WebServlet("/delete1")
public class delete1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String FName=request.getParameter("fname");
		String LName=request.getParameter("lname");
		CustomerDetailService  cds= new CustomerDetailsImpl();
		cds.deleteCustomerDetail(FName,LName);
		RequestDispatcher rd=request.getRequestDispatcher("/AllCustomerDetails");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
