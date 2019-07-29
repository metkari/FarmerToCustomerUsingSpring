<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="/FarmerToCustomerUsingSpring/login" method="GET">

 Email: <form:input path="cEmail"/>
 Password:<form:password path="cPassword"/>

<input type="submit" value="Login">



</form:form>
<a href="/FarmerToCustomerUsingSpring/register"></a>

</body>
</html>