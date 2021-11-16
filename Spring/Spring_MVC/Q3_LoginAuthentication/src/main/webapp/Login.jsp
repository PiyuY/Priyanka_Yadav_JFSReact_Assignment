<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login Validation</title>
</head>
<body style="display: flex; justify-content: center; align-items: center; flex-direction: column;">
	<h1 style="text-align: center; width: 100%;">Login Page</h1>
	<form action="authenticateUser" method="post" modelAttribute="user" style="border: 2px solid gray; padding:40px; align-content: center;">
	
		
		<label for="usernameId">Username : </label>
		<input id="usernameId" name="username" type="text"/>
		<br/><br/>
		<label for="passwordId">Password : </label>
		<input id="passwordId" name="password" type="password"/>
		<br/><br/>
		
		<button type="submit" style="width: 220px; height: 30px; text-decoration: black; background-color: white; border-radius: 15px; border: 2px solid blue">
			Login
		</button>
		<br/> <br/>
		Don't have account? <a href="/">Register</a>
		
	</form>
</body>
</html>