<%@ page language="java" import="java.util.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<%
		HashMap<String,String> capital=new HashMap<String,String>();
	  capital.put("Karnataka", "Bangalore");
	  capital.put("maharashtra", "Mumbai");
	  capital.put("Tamilnadu", "Chennai");
	  capital.put("Panjab", "Chandigarh");
	  
	
	  request.setAttribute("capital", capital);
	
	%>
	
	<h3>
	${capital.maharashtra}
	<br>
	${requestScope.capital["Karnataka"] }
	</h3>
</body>
</html>