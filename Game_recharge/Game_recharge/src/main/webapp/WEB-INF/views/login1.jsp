<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Here!!</title>
<link rel="stylesheet"  href = "Render.css"> 
</head>
<body>
	<form action="login" method="post">
		<h1 class = "title">Welcome!</h1>
			<table style="with: 50%">
				<tr>
					<td>UserId</td>
					<td><input type="text" name="accname" /></td>
				</tr>
					<tr>
					<td>Password</td>
					<td><input type="password" name="password_" /></td>
				</tr>
			</table>
			<input type="submit" value="Login"/></form>
</body>
</html>