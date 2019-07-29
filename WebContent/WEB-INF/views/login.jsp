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


Go To <a href="/FarmerToCustomerUsingSpring/"> Home</a>

<%  
StringBuffer sb=new StringBuffer();  
for(int i=1;i<=5;i++)  
{  
    sb.append((char)(int)(Math.random()*79+23+7));  
}  
String cap=new String(sb);  
%>  

<script type ="text/javascript">  
function validation(){  
    var c1 = document.forms.loginform.cap1.value;  
    var c2 = document.forms.loginform.cap2.value;
    
    if(!(c1==c2)){ 
		alert("sorry.. Please enter Correct captcha.!");
		return 1;  
		} 
    return 0;
    }  
 
</script> 
 <script>
		 function check() {
			
			 var result =validation();
			 if(result==1){
							   
			   return false;
		     }
			 else {
		    return true;
			 }
		}
		
		 </script>

 



<h3 style="color: red">${msg}</h3>

<form:form action="/FarmerToCustomerUsingSpring/loginUser" method="POST">


 Email   :<form:input path="cEmail"/><br>

 Password:<form:password path="cPassword"/><br>
 
 <s:textfield cssClass="login-input" name="cap2" value="Entere Captcha Here" />
		<input type="hidden" name="cap1"  value='<%=cap%>' readonly="readonly"/>
 
 
<input type="submit" value="Login">



</form:form>
</table>
New User?<a href="/FarmerToCustomerUsingSpring/register"> Register here</a>


</body>
</html>