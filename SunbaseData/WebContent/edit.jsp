<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" 
    import="com.demo.beans.CustomerDetails"%>
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
</head>
<body>
	<% CustomerDetails cd= (CustomerDetails)request.getAttribute("custDetail"); %>
	<div class="container m-4" >
	<div class="row">
	<div class="mx-auto col-10 col-md-8 col-lg-6">
	<div class="m-2"> <h2>Customer Details</h2></div>
	
		<form action="UpdateCustomerDetails" method="post">
	<div class="row">
		  <div class="mb-3 col-sm p-1">
		    <label for="firstname" class="form-label">First Name</label>
		    <input type="text" class="form-control "name="fname" id="firstname" value="<%=cd.getFirstName() %>" readonly aria-describedby="emailHelp">
		   
		  </div>
		  <div class="mb-3 col-sm p-1">
		    <label for="lastname" class="form-label">Last Name</label>
		    <input type="text" class="form-control " name="lname" id="lastname" value="<%=cd.getLastName() %>" readonly>
		  </div>
	</div>	
	<div class="row">  
		  <div class="mb-3 col-sm p-1">
		    <label for="Address" class="form-label">Address</label>
		    <input type="text" class="form-control" name="address" id="Address" value="<%=cd.getAddress() %>">
		  </div>
		  <div class="mb-3 col-sm p-1">
		    <label for="street" class="form-label">Street</label>
		    <input type="text" class="form-control" name="street" id="street" value="<%=cd.getStreet() %>">
		  </div>
	</div>	
	<div class="row">    
		   <div class="mb-3 col-sm p-1">
		    <label for="city" class="form-label">City</label>
		    <input type="text" class="form-control" name="city" id="city" value="<%=cd.getCity() %>">
		  </div>
		   <div class="mb-3 col-sm p-1">
		    <label for="state" class="form-label">State</label>
		    <input type="text" class="form-control" name="state" id="state" value="<%=cd.getState() %>">
		  </div>
	</div>	
	<div class="row">      
		  <div class="mb-3 col-sm p-1">
		    <label for="email" class="form-label">Email</label>
		    <input type="email" class="form-control" name="email" id="email" value="<%=cd.getEmail() %>">
		  </div>
		   <div class="mb-3 col-sm p-1">
		    <label for="phoneno" class="form-label">Phone No</label>
		    <input type="text" class="form-control"  name="phoneno" id="phoneno" value="<%=cd.getPhone() %>">
		  </div>
	</div>  
		  
		 
  <button type="submit" class="btn btn-primary">Update</button>
  
</form>
	</div>
	</div>
	</div>
</body>
</html>