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
		String url = request.getParameter("url");
		System.out.println(url);
		
		// option에 value값 줘서 직접 url로 이동하게 만들고 싶을때
		// response.sendRedirect(url); -> "다음" 페이지로 이동할때
		// 아래 if문 모두 지우고 위 코드만 적어야함
		
		if(url.equals("네이버")){
			response.sendRedirect("http://www.naver.com");
		}else if(url.equals("구글")){
			response.sendRedirect("http://www.google.com");
		}else if(url.equals("스마트인재개발원")){
			response.sendRedirect("http://smhrd.or.kr");
		}else if(url.equals("호두아빠")){
			response.sendRedirect("http://youtube.com/@HodooDady");
		}
	
	%>

</body>
</html>