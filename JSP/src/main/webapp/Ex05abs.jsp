<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<!-- 선언문 : <%! %> -->
<%!
	// 절댓값 구하는 메소드 만들기
	private int abs(int num){
		/* 방법 1*/
		/* if(num < 0){
			return num*(-1);
			
		}else{
			return num;
		}*/
		
		/* 방법2*/
		/*if(num < 0){
			num*= -1;
		}
		return num;
}*/
	
		/*방법3*/
		return (num < 0)? num*(-1) : num;
	}
%>

	<!-- 웹 페이지에 띄우기 -->
	<%=abs(5) %> <br>
	<%=abs(-5) %>

</body>
</html>

