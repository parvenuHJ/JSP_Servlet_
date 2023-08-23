<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="UpdateService" method="post">
		<h2>회원정보 수정</h2>
		ID : <input type="text" name="id"><br>
		PW : <input type="password" name = "pw"><br>
		NICK : <input type="text" name="nick">
		<input type="submit" value="회원수정하기">
	
	</form>

</body>
</html>