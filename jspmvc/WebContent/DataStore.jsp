<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Data Store</title>
</head>
<body>
<%

	String message="";
	if(request.getAttribute("message")!=null)
	{
		message=request.getAttribute("message").toString();
	}
	

%>

<h1 style="text-align:center;">Registration form</h1>
<span style="color:red"><%=message %></span>

	<form method="post" action="UserController">			
			ID :<input type="text" name="id"/><br>
			Name :<input type="text" name="name"/><br>
			<input type="submit" name="Register" value="Register"/><br>
			<input type="reset" name="submit" value="Reset"/>	
	</form>

</body>
</html>