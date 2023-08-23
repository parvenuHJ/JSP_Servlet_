<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
			<!-- 서블릿 -> "JoinService"  매핑 값만 넣어주면됨 -->
	<form action="JoinService" method="post">
		<h2>회원가입</h2>
		ID : <input type="text" name="id"><br>
		PW : <input type="password" name = "pw"><br>
		NICK : <input type="text" name="nick">
		<input type="submit" value="회원가입">
	
	</form>

</body>
</html>