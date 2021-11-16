<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form</title>
</head>
<body>
	<div align="center">
		<h1>Registration Form</h1>
		<form action="<%= request.getContextPath() %>/register" method="post">
	      <ul>
	         <li><p><b>First Name:</b>
	            <%= request.getParameter("first_name")%>
	         </p></li>
	         <li><p><b>Last  Name:</b>
	            <%= request.getParameter("last_name")%>
	         </p></li>
	         <li><p><b>Phone Number:</b>
	            <%= request.getParameter("phone")%>
	         </p></li>
	         <li><p><b>Account  Number:</b>
	            <%= request.getParameter("accname")%>
	         </p></li>
	         <li><p><b>Password:</b>
	            <%= request.getParameter("password_")%>
	         </p></li>
	         <li><p><b>Confirm Password:</b>
	            <%= request.getParameter("confirm")%>
	         </p></li>
	      </ul>
	      <input type="submit" value="Submit" />
	      </form>
	</div>
</body>
</html>