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
		int num = 11;
		int sum = num;
	%>
	
	<%!
		public String isOdd(int num){
		
		return (num%2==1) ? num+"은 홀수입니다." : num+"은 짝수입니다.";
	}
	
	
	%>
	
	<%=isOdd(num) %>



</body>
</html>