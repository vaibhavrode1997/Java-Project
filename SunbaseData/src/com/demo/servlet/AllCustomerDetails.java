package com.demo.servlet;

import java.io.IOException;
import java.util.List;

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
 * Servlet implementation class AllCustomerDetails
 */
@WebServlet("/AllCustomerDetails")
public class AllCustomerDetails extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		CustomerDetailService  cds= new CustomerDetailsImpl();
		List<CustomerDetails> custList= cds.getAllCustomerDetails();
		request.setAttribute("custlist", custList);
		RequestDispatcher rd = request.
				getRequestDispatcher("displayAll.jsp");
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
