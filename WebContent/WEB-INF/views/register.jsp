<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register Page</title>
Go To <a href="/FarmerToCustomerUsingSpring/"> Home</a>
	
<form:form action="/FarmerToCustomerUsingSpring/saveCustomer" method="POST">

Name   :<form:input path="cName"/><br>
Address   :<form:input path="cAddress"/><br>

 Email   :<form:input path="cEmail"/><br>

 Password:<form:password path="cPassword"/><br>
 Mobile No:<form:input path="cMobileno"/><br>
 
<input type="submit" value="Register">

</form:form>
	
</body>
</html>