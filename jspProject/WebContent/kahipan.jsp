<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<jsp:useBean id="fn" scope="application" class="com.atos.java.jsp.Customer"></jsp:useBean>
<jsp:setProperty property="custcode" name="fn" value="1002"/>
<jsp:setProperty property="custname" name="fn" value="Shital"/>
</head>
<body>

		<h3>Customer Code : <jsp:getProperty property="custcode" name="fn"/></h3>
		<h3>Customer Name : <jsp:getProperty property="custname" name="fn"/></h3>

</body>
</html>