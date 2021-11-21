<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sign Up</title>
<link rel="stylesheet"  href = "Render.css"> 
</head>
<body>
<form action="<%= request.getContextPath() %>/Signup" method="post">
<h1 class = "title">Sign Up Now!</h1>	
<table>
<tr><td>First Name: </td><td><input type="text" name="first_name"></td></tr>
<tr><td>Last Name: </td><td><input type="text" name="last_name"></td></tr>
<tr><td>Phone Number: </td><td><input type="text" name="phone"></td></tr>
<tr><td>Account Number: </td><td><input type="text" name="accname"></td></tr>
<tr><td>Password: </td><td><input type="password" name="password"></td></tr>
<tr><td>Confirm Password: </td><td><input type="password" name="confirmpassword"></td></tr>
<tr><td></td><td><input type="submit" value="register"></td></tr>
</table>
</form>
</body>
</html>