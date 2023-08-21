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
		// 세션 -> 객체 생성할 필요 없음
		// 서버에 그냥 저장되니까 클라이언트에게 전송할 필요 없음
		// 세션 값 설정 setAttribute(name(String타입), value(Object(최상위타입) :모든 타입 다 됨));
		session.setAttribute("id", "test");
		session.setAttribute("age", 20);
		
		// 어차피 서버가 알아서 세션 아이디를 부여해줄 것이기 때문에 따로 응답할 필요없이 저장만 해주면 됨.
	
	%>
	
	<a href="Ex05GetSession.jsp">세션 확인</a>


</body>
</html>