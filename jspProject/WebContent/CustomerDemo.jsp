<%@ page language="java" import="com.atos.java.jsp.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	
Customer c=new Customer();

c.setCustcode(8055);
c.setCustname("Shital");


out.println("<h1>Customer Code :"+c.getCustcode());
out.println("<br>Customer Name :"+c.getCustname()+"</h1>");


%>

</body>
</html>