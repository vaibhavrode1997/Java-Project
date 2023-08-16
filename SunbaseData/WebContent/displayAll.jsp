<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="java.util.List, com.demo.beans.CustomerDetails"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
	
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" 
	integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==" 
	crossorigin="anonymous" referrerpolicy="no-referrer" />
	
</head>
<body>

	<% List<CustomerDetails> custlist1 = (List<CustomerDetails>)request.getAttribute("custlist");%>
<div class="mt-5">
<div class="row">
		<div class=col-sm-4 col-md-6 col-lg-5">
		 <a href="register.html"  class="btn btn-primary" >AddCustomer</a></input>
		 </div>
		 <div class=" col-sm p-.25rem center">
		 <h2>Customer List</h2>
		 </div>
		
 </div>
   <hr style="height:1px">

	<table class="table table-striped">

		<thead>
			<tr>

				<th scope="col">First Name</th>
				<th scope="col">Last Name</th>
				<th scope="col">Address</th>
				<th scope="col">Street</th>
				<th scope="col">City</th>
				<th scope="col">State</th>
				<th scope="col">Email</th>
				<th scope="col">Phone</th>
				<th scope="col">Action</th>
			</tr>
		</thead>
		<tbody>
		<% for(CustomerDetails csd1:custlist1) {
		%>
			<tr>
				<!-- <th scope="row">1</th> -->
				<td><%=csd1.getFirstName() %></td>
				<td><%=csd1.getLastName() %></td>
				<td><%=csd1.getAddress() %></td>
				<td><%=csd1.getStreet() %></td>
				<td><%=csd1.getCity() %></td>
				<td><%=csd1.getState() %></td>
				<td><%=csd1.getEmail() %></td>
				<td><%=csd1.getPhone() %></td>
				<td><a href="edit?fname=<%=csd1.getFirstName() %>&lname=<%=csd1.getLastName() %>" ><i class="fa-solid fa-pencil"></i></a>|<a href="delete1?fname=<%=csd1.getFirstName() %>&lname=<%=csd1.getLastName() %>" ><i class="fa-solid fa-trash-can"></i></a></td>
				
			</tr>
			<%} %>
		</tbody>

	</table>
</div>
</body>
</html>