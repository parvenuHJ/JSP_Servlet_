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
	<%
		
		for(int i =1; i <=10 ; i++){
			
			out.print("<td>");
			out.print(i);
			out.print("</td>");
			
		}
	%>
	</tr>
	
	</table>

</body>
</html>