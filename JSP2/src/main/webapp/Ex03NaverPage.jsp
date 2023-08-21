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
		// 서버가 다시 접속해야될 url을 준다
		// 접속해야될 url은 sendRedirect("url")
		response.sendRedirect("http://www.naver.com");
	%>


</body>
</html>