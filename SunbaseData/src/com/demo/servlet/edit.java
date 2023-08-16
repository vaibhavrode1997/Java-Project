package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.CustomerDetails;
import com.demo.service.CustomerDetailService;
import com.demo.service.CustomerDetailsImpl;

/**
 * Servlet implementation class edit
 */
@WebServlet("/edit")
public class edit extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		//getting parameters from Request Url
		String FName=request.getParameter("fname");
		String LName=request.getParameter("lname");
		CustomerDetailService  cds= new CustomerDetailsImpl();
		CustomerDetails  cds1= cds.getCustomerInformation(FName,LName);
		request.setAttribute("custDetail", cds1);
		RequestDispatcher rd = request.
				getRequestDispatcher("edit.jsp");
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
