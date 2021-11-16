<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body style="display: flex; justify-content: center; align-items: center; flex-direction: column;">
	<%if(request.getAttribute("message")!=null){ %>
		<h3 style="color: red"><%= request.getAttribute("message") %></h3>
	<% } %>
	<h1 style="text-align: center; width: 100%;">Registration Form</h1>
	<form action="registerUser" method="post" modelAttribute="user" style="border: 2px solid gray; padding:40px; align-content: center;">
		<label for="emailId">Email : </label>
		<input id="emailId" name="email" type="email"/>
		<br/><br/>		
		<label for="usernameId">Username : </label>
		<input id="usernameId" name="username" type="text"/>
		<br/><br/>
		<label for="passwordId">Password : </label>
		<input id="passwordId" name="password" type="password"/>
		<br/><br/>
		
		<button type="submit" style="cursor:pointer; width: 220px; height: 30px; text-decoration: black; background-color: white; border-radius: 15px; border: 2px solid blue">
			Register
		</button>
		<br/> <br/>
		Already have account? <a href="/Q4_LoginAuthentication_JDBC">Login</a>
		
	</form>
</body>
</html>