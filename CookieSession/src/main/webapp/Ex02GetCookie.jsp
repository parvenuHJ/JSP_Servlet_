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
	// 쿠키 객체 가져오기 .getCookies -> 타입 : 배열
	Cookie[] cookies =  request.getCookies();
	
	// 확장 for문 : 무조건 0번 인덱스부터 모두 다 가져옴 for(데이터타입 변수명 : 배열이름)
	for(Cookie c : cookies){
		out.print(c.getName() + ":" + c.getValue() + "<br>");
	}
	
	%>
	
	<a href="Ex03RemoveCookie.jsp">쿠키삭제</a>




</body>
</html>