
<%@page import="com.model.EmployeeModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
EmployeeModel emp=(EmployeeModel)request.getAttribute("emp");
%>
	<h1>Employee Edit Form</h1>
	<form method="post" action="/ORM/update">
		<table>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name" value="<%=emp.getName() %>"></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email" value="<%=emp.getEmail() %>"></td>
			</tr>
			<tr>
				<td>Mobile No:</td>
				<td><input type="text" name="mobile" value="<%=emp.getMobileno() %>"></td>
			</tr>
			<tr>
				<td>Address:</td>
				<td><input type="text" name="address" value="<%=emp.getAddress() %>"></td>
			</tr>
			<tr>
				<td>Gender:</td>
				<td><input type="text" name="gender" value="<%=emp.getGender() %>"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="text" name="password" value="<%=emp.getPassword() %>">
				<input type="hidden" name="id" value="<%=emp.getId() %>"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Update"></td>
			</tr>
		</table>
	</form>
</body>
</html>
