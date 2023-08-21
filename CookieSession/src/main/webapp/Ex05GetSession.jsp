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
	String id = (String)session.getAttribute("id"); // Object -> String으로 다운캐스팅
	int age = (int)session.getAttribute("age");// Object -> int로 다운캐스팅
	
	%>
	아이디 : <%=id %> <br>
	나이 : <%=age %>





</body>
</html>