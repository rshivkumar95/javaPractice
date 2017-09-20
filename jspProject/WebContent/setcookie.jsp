<%@ page language="java" import="java.util.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%
    
    String username=request.getParameter("username");
    
    Date now=new Date();
    
    
    
    String timestamp=now.toString();
    
    Cookie cookie=new Cookie("username",username);
    
    cookie.setMaxAge(365*24*60*60);
    
    response.addCookie(cookie);
    
    
    
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="showcookievalue.jsp">see value</a>
</body>
</html>