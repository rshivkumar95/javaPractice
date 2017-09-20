<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:set var="website" value="www.manipalglobal.com"/>
	Before removing the variable value :
	
	<c:out value="${website}"/><br>
	<c:remove var="website"/>
	
	After Removing the variable value :
	<c:out value="${website}"/>
	
	
	<c:set var="x" scope="session" value="25" />
	<c:if test ="${x > 10}">
		value=${x}
	</c:if>
	<br>
	<c:forEach var="i" begin="1" end="5" step="1">
		<c:forEach var="j" begin="1" end="${i}" step="1">
		   <c:out value="${j}"/>
		</c:forEach>
		 <br>
	</c:forEach>
	
	<c:forTokens items="Learning Java Is Fun" delims=" " var="name">  
    <c:out value="${name}"/><br>
</c:forTokens>  

	
	
</body>
</html>