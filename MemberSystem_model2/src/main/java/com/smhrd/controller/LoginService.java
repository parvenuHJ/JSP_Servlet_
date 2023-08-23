package com.smhrd.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginService")
public class LoginService extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
		request.setCharacterEncoding("UTF-8");
		
		// ID, PW , NICK 이 잘넘어오는지 이클립스 콘솔창에서 확인
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		// 1. 드라이버 동적로딩
		// - 사용하는 DBMS에 맞는 드라이버를 로딩
		// 외울 필요는 없음
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. 데이터베이스 연결
			// - 드라이버를 통해서 내가 사용하는 DBMS와의 연결
			//   데이터베이스 연결을 하기 위해서는 현재 내가 사용하는 DBMS의
			// 	 주소, 계정, 비밀번호가 필요하다.
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "SERVICE";
			String db_pw = "12345";
			
			
			
			conn = DriverManager.getConnection(db_url,db_id, db_pw);
			
			if (conn != null){
				System.out.println("DB연결 성공!");
			}else{
				System.out.println("DB연결 실패");
			}
			
			
			// 3. SQL문 실행
			// - 사용하고 싶은 SQL문장 작성 및 SQL문장 실행
			// 	 SQL문장을 완성시키고 실행할 수 있는 객체 필요
			//   -> PreparedStatement 객체 -> Connection객체를 통해 받아옴
			String sql = "SELECT * FROM WEBMEMBER WHERE ID=? AND PW=?";
			
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, id);
			psmt.setString(2, pw);
			
			//cnt = psmt.executeUpdate(); // Table에 변경이 일어날때 
			rs = psmt.executeQuery(); // Table을 조회하거나 변경이 안일어날떄 (Select문...)
			
			
			if(rs.next()){ // 커서를 한칸내렸을떄 값이 있으면
				System.out.println("로그인 성공!");
				
				// id를 세션으로 저장하기
				HttpSession session = request.getSession();
				session.setAttribute("id", id);
				
				response.sendRedirect("main.jsp?"); // 동일한 폴더안에 있어서 상대경로로 안적었음
			}else{
				System.out.println("로그인 실패!");
				response.sendRedirect("Login.jsp");
			}
			
			
		} catch (Exception e) { //ClassNotFoundException e 만 적혀있었는데, 다른것들도 catch문으로 잡아줘야되는데, 이때 Exception e 으로 최상위 예외상황으로 모두 잡아버림
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			// 4. 연결 끊기
			// - DB와 연결된 객체의 연결을 끊어준다 ( 역순으로 )
			try {
				if (rs != null){
					rs.close();
				}
				if(psmt != null){
					psmt.close();
				}
				
				if(conn != null){
					conn.close();
				}
				
			} catch (Exception e2) {

			}
			
			
		}
		
		
		
	
	}

}
