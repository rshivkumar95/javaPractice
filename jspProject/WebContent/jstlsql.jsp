<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="java.io.*,java.util.*,java.sql.*"%>  
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>      
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<sql:setDataSource var="snapshot" driver="oracle.jdbc.driver.OracleDriver"  
     url="jdbc:oracle:thin:@localhost:1521/xe"  
     user="hr"  password="hr"/>  
     
     <sql:query dataSource="${snapshot}" var="result">  
		  select * from BILL_MASTER
		</sql:query>  
		
		<table border="2" width="100%">  
			<tr>  
			<th>Bill No</th>  
			<th>Name</th>  
			<th>Amount</th>  
			</tr>  
			<c:forEach var="row" items="${result.rows}">  
					<tr>  
					<td><c:out value="${row.billno}"/></td>  
					<td><c:out value="${row.customer_name}"/></td>    
					<td><c:out value="${row.amount}"/></td>  
					</tr>  
			</c:forEach>  
		</table>  

</body>
</html>