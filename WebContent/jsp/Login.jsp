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
		User Name:<input type="text" name="loginModel.userName"><br/>
		Password :<input type="password" name="loginModel.password"><br/>
		<input type="submit" value="Log In">
	</form>
	New User. <a href="<s:url action='RegisterHere' />" >Register Her</a>
</body>
</html>