<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%request.setCharacterEncoding("UTF-8"); %>
    
    <%
    String[] arr = request.getParameterValues("fruit");

    
    
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1px" align="center" width = '300'>
			<tr>
				<h3 align ='center'>선호도 조사 결과</h3>
				<hr>
			</tr>
			<tr border="1px">
				<td align="center">이름</td>
				<td><%out.print(request.getParameter("name")); %></td>
			</tr>
			<tr>
				<td>좋아하는 과일</td>
				<td>
				<% for(int i = 0; i < arr.length ; i++){%>
				
				<%out.print(arr[i]); %>
				
				<%}; %>
				</td>
				
			</tr>
	
			
			
		</table>

</body>
</html>