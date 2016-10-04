<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>hw_registerSuccessPage</title>
</head>
<body>
	<%-- JSP Expression Language --%>
	<h3>You registered successfully.</h3>
	<ul>
		<li>Id: ${customer.id}</li>
		<li>PW: ${customer.password}</li>
		<li>Name: ${customer.name}</li>
		<li>Gender: ${customer.gender}</li>
		<li>Email: ${customer.email}</li>
	</ul>

	<p>
		<a href="/hwhelloMVC/index.jsp">go to home page</a>
	</p>
</body>
</html>