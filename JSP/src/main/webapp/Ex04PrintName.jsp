<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- POST 방식일 때 입력 -->
	<% request.setCharacterEncoding("UTF-8"); %>
	
	<h1>
	<% 
	out.print("입력한 이름 : ");
	out.print(request.getParameter("name"));
	String a = request.getParameter("name");
	%>
	</h1>
	
	<!-- jsp니까 표현식을 사용하자! -->
	입력한 이름 : <%=a %>
	
</body>
</html>