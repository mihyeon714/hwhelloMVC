<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>hw_loginSuccessPage</title>
</head>
<body>
	<h1>Login Success.</h1>
	<h2>${customer.name}logged in successfully.</h2>

	<%-- JSTL --%>
	<%-- 뭐가 저장되있는지 한번 봅시다 --%>
	<table style="border: 1px solid red; padding: 10px;">
		<%--<c:forEach var="customer" items="${customers}">  --%> <%--doLogin이 customers란 key로 보내준걸 customer로 정하고 루프돌리기 mh --%>
			<tr>
				<td>${customer.id}</td>
				<td>${customer.password}</td>
				<td>${customer.name}</td>
				<td>${customer.gender}</td>
				<td>${customer.email}</td>
			</tr>
		<%--</c:forEach>--%>
	</table>
	<p>
		<a href="/hwhelloMVC/index.jsp">go to home page</a>
	</p>
</body>
</html>