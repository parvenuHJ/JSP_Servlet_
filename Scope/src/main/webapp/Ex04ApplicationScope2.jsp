<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		String appName = (String)application.getAttribute("name");
		String sesName = (String)application.getAttribute("name");
	
	%>

	Application : <%= appName %><br>
	Session : <%= sesName %>


</body>
</html>