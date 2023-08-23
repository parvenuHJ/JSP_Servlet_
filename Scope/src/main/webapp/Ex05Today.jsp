<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- application 영역을 활용한 Today 카운트 기능 만들기 -->
	<%
	
		// 현재 페이지를 요청할 때마다 방문자 수를 1씩 올리시오 
		
		
		String toDay = (String)application.getAttribute("toDay");
	
		// int Today = (int) application.getAttribute("today"); 가 안됨 ( 업데이트 되서 이제 되네 )
		// 여기에서 application.setAttribute("today", 1); 는 int형 1으로 들어간게 아님
		// Integer a = new Interger(1); 정수형 객체 (레퍼런스 객체) 로 들어간것임  / int -> 기본형 객체
		
	
		
		
		// int 형인 chToday 을 문자열로 다시 넣어줌 -> chToday+"" 
		
		
		 if(toDay == null) {
         application.setAttribute("toDay", "1");
      }else{
         int chToDay = Integer.parseInt(toDay);
         chToDay++;
         application.setAttribute("toDay", chToDay + "");
      }
	
	
		
	
	%>
	
	<h2>오늘 방문자 수 : <%= toDay %></h2>


</body>
</html>