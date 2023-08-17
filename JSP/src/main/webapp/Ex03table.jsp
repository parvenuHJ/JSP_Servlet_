<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	
	이게 왜 되지?
	<table border="1px">
	<tr>
	<!--  내 방법 -->
	 <%
		
		for(int i =1; i <=10 ; i++){
			
			out.print("<td>");
			out.print(i);
			out.print("</td>");
			
		}
	%>
	</tr>
	<tr>
	<!-- 스크립틀릿 끊어서 사용하기 -->
	<% for(int i = 1; i <= 10; i++){ %>
		<td><%=i %></td>
		<%} %>
	</tr>
	
	</table>

</body>
</html>