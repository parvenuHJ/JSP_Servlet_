<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 
	1부터 100까지의 합을 웹 페이지에 출력하시오 (h2 태그 활용)
	예 : 1부터 100까지의 합은 <구한값>입니다.
	 -->
	 <% 
	 int result = 0;
	 for(int i =1 ; i<=100 ; i++){
		 result +=i;
	 }
		 %>
	<h2> 1부터 100까지의 합은 <%=result %> 입니당 </h2>
</body>
</html>