<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<s:property value="loginModel.loginFailure" /><br/>
	<form action="Login" method="post">
		
		User Name:<input type="text" name="loginModel.userName" /><s:fielderror fieldName="loginModel.userName" cssStyle="color:red"></s:fielderror><br/>
		Password :<input type="password" name="loginModel.password" /><s:fielderror fieldName="loginModel.password" cssStyle="color:red"></s:fielderror><br/>
		<input type="submit" value="Log In">
	</form>
	<!-- <s:form action="Login" method="post">
      <s:textfield name="loginModel.userName" label="User Name" size="20" /><br/>
      <s:textfield name="loginModel.password" label="Password" size="20" /><br/>
      <s:submit name="submit" label="Log In" align="center" />
   </s:form> -->
	New User. <a href="<s:url action='RegisterHere' />" >Register Here</a>
</body>
</html>