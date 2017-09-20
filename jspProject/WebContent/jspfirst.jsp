<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
        
<h1>Example </h1>

<% out.println("Welcome to jsp scriptlet"); %>
<%=4+5 %>
<%
out.println("<br>"+" The Local Address is :"+request.getLocalAddr()); 
out.println("<br>"+" The URI is :"+request.getRequestURI());
out.println("<br>"+" The Remote Address is :"+request.getRemoteAddr());
out.println("<br>"+" The Remote Host is :"+request.getRemoteHost()); 
out.println("<br>"+" The Remote User is :"+request.getRemoteUser());
out.println("<br>"+" The Protocol is :"+request.getProtocol()); 
out.println("<br>"+" The Server port is :"+request.getServerPort());
out.println("<br>"+" The Server name is :"+request.getServerName()); 


%>
</body>
</html>