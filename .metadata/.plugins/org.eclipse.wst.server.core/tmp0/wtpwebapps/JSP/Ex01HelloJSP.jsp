<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Hello World!
	
	<!-- HTML 주석 -->
	<%-- JSP 주석
		 JSP안에서 자바코드를 사용하고 싶으면 "스크립트릿" -> <% %> 이라는 것을 사용한다
		 표현식 -> 출력결과(html 요소 내)에 값을 넣기 위해 사용 -> <%=  %>
	--%>
	
	<%
		String name = "김훈종";
		String result = "";
		int age = 20;
		if(age >=19){
			result = "성인";
		}else {
			result = "청소년";
		}
		
	%>
	
	<%-- java의 값을 web browser에 출력하기 위해 사용 - 표현식 --%>
	
	나의 이름은 <%=name %> 이고
	저는 <%=result %> 입니다.
	
	<br>
	
	<hr color="red" size='<%=age%>'> <!-- 변수값으로도 jave값을 사용할 수 있다. -->
	
	
</body>
</html>