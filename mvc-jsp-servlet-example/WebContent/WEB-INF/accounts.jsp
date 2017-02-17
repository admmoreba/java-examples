
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Bank Accounts</title>
</head>
<body>

	<%-- ${requestScope.accounts} --%>

	<c:if test="${!empty requestScope.accounts}">
		<h4>List Of Accounts</h4>
		<br />
		<table style="border: 2px">
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Last Name</th>
				<th>Telephone</th>
			</tr>

			<c:forEach var="account" items="${requestScope.accounts}">
				<tr>
					<td>${account.accountNo}</td>
					<td>${account.name}</td>
					<td>${account.email}</td>
					<td>${account.balance}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>