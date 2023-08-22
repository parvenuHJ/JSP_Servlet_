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
// 쿠키 -> 클라이언트의 pc에 저장됨 , 텍스트형태로 저장, 보안에 상대적으로 약함, 쿠키는 무제한이 저장안됨, 공통 : 브라우저가 꺼지면 사라짐
// 세션 -> 서버에 저장됨, object(객체)형태로 저장, 보안에 상대적으로 강함, 서버가 허용하는 많은양 저장가능, 공통 : 브라우저가 꺼지면 사라짐
	
	
	
	
	// 1. 쿠키 객체 생성
	// new Cookie(name(String타입),value(String타입));
	Cookie cookie = new Cookie("test","cookie");
	
	// 2. 유효기간 설정(초단위)
	cookie.setMaxAge(60*60*24*365); // -> 유효기간 1년
	
	// 3. 클라이언트에게 쿠키 전송(서버 -> 클라이언트)
	response.addCookie(cookie);
	
	// 4. 쿠키를 생성하면서 전송
	response.addCookie(new Cookie("test2","cookie2"));
	
	
	%>
	
	<a href="Ex02GetCookie.jsp">쿠키확인</a>


</body>
</html>