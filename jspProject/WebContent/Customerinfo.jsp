<%@ page language="java" import="com.atos.java.jsp.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!int cno;%> 
<%!String cname; %>

<%
  
  //Customer c=new Customer();

   cno=Integer.parseInt(request.getParameter("t1"));
   cname=request.getParameter("t2"); 
  // c.setCustcode(cno);
   //c.setCustname(cname);
   
   
   %>
   
 <jsp:forward page="showCustomer.jsp" >
 <jsp:param value="<%=cno %>" name="custcode"/>
 <jsp:param value="<%=cname%>" name="custname" />  
</jsp:forward>


%>





</body>
</html>