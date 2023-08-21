<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
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
		// 여기의 코드는 service 클래스에 저장됨 -> try catch문 안써도 됨
		
		request.setCharacterEncoding("UTF-8");
	
		// ID, PW , NICK 이 잘넘어오는지 이클립스 콘솔창에서 확인
		String id = request.getParameter("id");
		System.out.println(id);
		String pw = request.getParameter("pw");
		System.out.println(pw);
		String nick = request.getParameter("nick");
		System.out.println(nick);
				
		int cnt = 0;
		
		// 0. 사용하고자 하는 DBMS 드라이버를 프로젝트에 추가
		
		// 1. 드라이버 동적로딩
		// - 사용하는 DBMS에 맞는 드라이버를 로딩
		// 외울 필요는 없음
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// 2. 데이터베이스 연결
		// - 드라이버를 통해서 내가 사용하는 DBMS와의 연결
		//   데이터베이스 연결을 하기 위해서는 현재 내가 사용하는 DBMS의
		// 	 주소, 계정, 비밀번호가 필요하다.
		String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
		String db_id = "SERVICE";
		String db_pw = "12345";
		
		
		
		Connection conn = DriverManager.getConnection(db_url,db_id, db_pw);
		
		if (conn != null){
			System.out.println("DB연결 성공!");
		}else{
			System.out.println("DB연결 실패");
		}
		
		
		// 3. SQL문 실행
		// - 사용하고 싶은 SQL문장 작성 및 SQL문장 실행
		// 	 SQL문장을 완성시키고 실행할 수 있는 객체 필요
		//   -> PreparedStatement 객체 -> Connection객체를 통해 받아옴
		String sql = "INSERT INTO WEBMEMBER VALUES(?,?,?)";
		
		PreparedStatement psmt = conn.prepareStatement(sql);
		
		psmt.setString(1, id);
		psmt.setString(2, pw);
		psmt.setString(3, nick);
		
		cnt = psmt.executeUpdate(); // Table에 변경이 일어날때 
		// psmt.executeQuery(); // Table을 조회하거나 변경이 안일어날떄 (Select문...)
		
		// 4. 연결 끊기
		// - DB와 연결된 객체의 연결을 끊어준다 ( 역순으로 )
		if(psmt != null){
			psmt.close();
		}
		
		if(conn != null){
			conn.close();
		}
		
		if(cnt > 0){
			System.out.println("회원가입 성공!");
			response.sendRedirect("main.jsp"); // 동일한 폴더안에 있어서 상대경로로 안적었음
		}else{
			System.out.println("회원가입 실패!");
			response.sendRedirect("join.jsp");
		}
	
	%>

</body>
</html>