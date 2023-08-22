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
		// 세션 -> jsp에서는 set으로 넣었다면 서버에 저장됨 : 가져오기만 하면됨
		
		// String name = session.getAttribute("name"); 
		// Type mismatch: cannot convert from Object to String
		// setAttribute(String name, Object value) : 자식타입은 부모타입으로 자동 형변환됨
		// .setAttribute("name", "김훈종"); -> "김훈종" 이라고 object타입에 넣었지만 자동형변환되어서 Object타입으로 변환됨
		// 따라서 String name 에 넣어줄려면 Object->String 형변환을 해줘야함
		
		// 왜 세션은 굳이 Object로 받는 걸까?
		// 모든 클래스의 부모 -> Object
		// 장점 : value의 타입이 어떤 타입이든 다 들어갈 수 있음 (쿠키는 text형태만 되는 것에 반해)
		// 객체지향언어특성 중 -> "다형성" 에 해당함 (모든 형태의 데이터를 받아들일 수 있음)
		String name = (String)session.getAttribute("name"); 
		
		
	%>
	<!-- session이 만료되었을때는 ClickSession.jsp로 보내기 -->
	<% if(name != null){ %> <!-- 세션이 만료안됐을 때 -->
	<%=name %> 님 환영합니다.
	<a href="Ex06RemoveSession">로그아웃</a>
	<%} else{%> <!-- 세션이 만료되었을 때 -->
	
		<script type="text/javascript">
			alert('100초동안 아무런 행동을 하지않아 로그아웃 됩니다.');
			location.href="Ex06ClickSession.jsp";
		</script>
	
	<%} %>

</body>
</html>