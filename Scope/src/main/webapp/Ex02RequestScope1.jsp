<%@page import="org.apache.tomcat.util.http.fileupload.RequestContext"%>
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
	// request 영역에 값 저장
	request.setAttribute("nick", "쿠키몬스터");
	
	// request 영역의 값 가져오기
	String nick = (String)request.getAttribute("nick");

	// forwarding 방식 사용해서 request객체 공유해보기
	// forwarding 방식 만나자마자 바로 Ex02RequestScope2 으로 넘어가버려서 바로 아래 코드는 실행 안되고 넘어감
	RequestDispatcher rd = request.getRequestDispatcher("Ex02RequestScope2.jsp");
	rd.forward(request, response);
	%>


	닉네임 : <%=nick %>
	<br>
	닉네임(EL) : ${nick}
	<br>
	<a href="Ex02RequestScope2.jsp">2페이지로 이동</a>
</body>
</html>