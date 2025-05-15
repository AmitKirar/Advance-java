<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%@ include file="Header.jsp"%>
	<form action="UserListCtl.do" method="post">

		<h1 align="center">User List</h1>
		<%
			List list = (List) request.getAttribute("list");
			String msg = (String) request.getAttribute("msg");
		%>

		<%
			if (msg != null) {
		%>
		<h3 align="center"><%=msg%></h3>
		<%
			}
		%>

		S
		<table>
			<tr>
				<td><input type="text" name="firstName"
					placeholder="search by firstName"> &nbsp; <input
					type="text" name="lastName" placeholder="search by lastName">
					&nbsp;<input type="text" name="loginId"
					placeholder="search by loginId">&nbsp;<input type="text"name="dob"placeholder="search by dob">&nbsp; <input
					type="submit" name="operation" value="search"></td>
			</tr>
		</table>
		<br>

		<table border="2px" width="100%">

			<tr style="background-color: skyblue">

				<th>Select</th>
				<th>id</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>LoginId</th>
				<th>DOB</th>
				<th>EDIT</th>
			</tr>
			<%
				Iterator it = list.iterator();

				while (it.hasNext()) {
					UserBean bean = (UserBean) it.next();
			%>


			<td><input type="checkbox" name="ids" value=<%=bean.getId()%>></td>

			<td><%=bean.getId()%></td>
			<td><%=bean.getFirstName()%></td>
			<td><%=bean.getLastName()%></td>
			<td><%=bean.getLoginId()%></td>
			<td><%=bean.getDob()%></td>
			<td><a href="UserCtl.do?id=<%=bean.getId()%>">edit</a></td>


			</tr>
			<%
				}
			%>

			<centre>
		</table>


		<table>
			<tr>
				<h3 align="center">
					<input type="submit" value="delete" name="operation">
				</h3>
			</tr>
		</table>
		</centre>
	</form>
</body>
</html>

