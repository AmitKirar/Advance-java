<%@page import="com.rays.bean.UserBean"%>
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
		UserBean  user = (UserBean)session.getAttribute("user");
	%>

	<%
		if (user != null) {
	%>
	<h3><%="Hi, " + user.getFirstName()%></h3>
	<a href="UserCtl.do">Add User</a> |
	<a href="UserListCtl.do">User list</a> |
	<a href="LoginCtl?operation=logout">logout</a>

	<%
		} else {
	%>
	<h3>Hi, Guest</h3>

	<a href="UserRegistrationCtl">SingUp</a> |
	<a href="LoginCtl">Login</a>
	<%
		}
	%>
	<hr>

</body>
</html>