<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- Create Read Update Delete : CRUD (개발자가 사용하는 용어)
			어떤 페이지든 CRUD는 있어야한다  -->
			
	<% String id = request.getParameter("id"); 
		if (id!= null){%>
			<%=id %>님 환영합니다~
		<% }
	%>
	
	<ul>
		<li><a href ="Login.jsp">로그인</a></li>
		<li><a href="join.jsp">회원가입</a></li>
		<li><a href="update.jsp">회원정보수정</a></li>
		<li><a href="delete.jsp">회원탈퇴</a></li>
		<li><a href ="member.jsp">회원목록보기</a></li>
	</ul>
</body>
</html>