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
	// Scope - 서버에 저장할 수 있는 영역(공간)
	// 어떤 scope를 쓰냐에 따라 공간의 크기가 달라짐
	// scope - 총 4가지 : pageScope requestScope sessionScope applicationScope   > 오른쪽으로 갈수록 큰 영역
	// pageScope - 영역 : 현재 기준이 되는 페이지
	// requestScope - 영역 : 요청받은 곳에서 저장되는 영역 => forwarding 방식으로 요청해서 다른 곳으로 확장 가능 (장바구니 등등...)
	// sessionScope - 영역 : 서버에 저장 , 브라우저에 관련된 영역 (개인정보 관련 보관하는 영역)
	// applicationScope - 영역 : 프로젝트에 관련된 영역 (모두가 공유하는 영역 - 보안에는 취약) -> 서버가 다운되기 전까지는 살아있음 (날짜,날씨,투데이뷰 등...)
	
	
	
	
	// page 영역에 값 저장 -> .setAttribute(name(String타입) , value(Object타입))-> Object타입으로 업캐스팅되어 저장됨
	// 이 페이지에서만 사용할 수있는 변수 - > Ex01PageScope2 에서 닉네임(EL) : ${pageScope.nick} 하면 null임
	pageContext.setAttribute("nick", "쿠키몬스터");
	
	// page 영역에 값 가져오기 -> .getAttribute(name(String타입)) -> Object타입으로 업캐스팅되어 저장됨
	String nick = (String)pageContext.getAttribute("nick");
	%>
	
	닉네임 : <%=nick %>
	<br>
	<!-- EL표기법으로 가져오기 
	pageContext.setAttribute("nick", "쿠키몬스터");
	String nick = (String)pageContext.getAttribute("nick");
	
	위 두 코드가 없어도 바로 불러올수 있음
	-->
	닉네임(EL) : ${pageScope.nick}
	<br>
	<a href="Ex01PageScope2.jsp">2페이지로 이동</a>

</body>
</html>