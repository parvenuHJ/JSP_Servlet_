<%@page import="java.util.ArrayList"%>
<%@page import="com.smhrd.servlet.PhoneDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>연락처 목록</h2>
	<table border="1px">
		<tr>
			<td>이름</td>
			<td>직급</td>
			<td>연락처</td>
			<td>이메일</td>
			<td>나이</td>
		</tr>
		<!-- 여기 아래에 세션에 담긴 한사람의 연락처 정보를 나오게하시오 -->
		
		<%
			// (PhoneDTO) 로 형변환 이유 :
			// .getAttribute => object 타입으로 리턴됨 => PhoneDTO타입으로 다운캐스팅을 해줘야함 
			// PhoneDTO dto = (PhoneDTO)session.getAttribute("dto");
			// "ArrayList<PhoneDTO>" 가 데이터 타입 전체 이름임!!!!!!!
			// session.setAttribute("list", list); 로 set 해줬었음
			ArrayList<PhoneDTO> list = (ArrayList<PhoneDTO>)session.getAttribute("list");
			
		%>
			
		<%for(int i =0 ; i < list.size() ; i++){ %>
		<tr>
						
			<td><%=list.get(i).getName() %></td>
			<td><%=list.get(i).getRank() %></td>
			<td><%=list.get(i).getPhone() %></td>
			<td><%=list.get(i).getEmail() %></td>
			<td><%=list.get(i).getAge() %></td>
			
		</tr>
		<%} %>
	</table>

</body>
</html>