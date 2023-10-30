<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="Logout">
		<table border="1px" align="center" width='250'>

			<tr>
				<td align="center"><%= session.getAttribute("id") %></td>
				<td>님 환영합니다!</td>
			</tr>

			<tr align="center">
				<td colspan="2"><input type="submit" value="로그아웃"></td>
			</tr>
		</table>
	</form>

</body>
</html>