package com.smhrd.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Ex06MakeSession")
public class Ex06MakeSession extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 세션의 풀네임 : HttpSession
				// 세션 -> 서버에 저장됨
				// 세션마다 저장되는 곳이 다름 - 목욕탕의 락커에 저장되는것과 비슷
				// 각 락커의 키가 필요함
				// 데이터를 열고싶으면 키가 필요 -> "쿠키" 형태로 키가 발급이됨
				// 쿠키 제거 -> 로그아웃됨
				// 세션은 하나의 브라우저당 하나의 키가 발급받음
				// 세션이 만료되는 순간 : 브라우저가 꺼지는 순간 and 기본적으로는 30분(서버에 저장되기때문에 용량을 조절)
				// 30분은 조절할 수 있음 -> .setMaxInactiveInterval(?초);
	
		// Servlet에서 Session 생성 후 값 넣기
		
	HttpSession session = request.getSession(); // 사용자의 정보는 모두 request객체에 저장됨
	
	session.setMaxInactiveInterval(100); // 세션 만료 : 100초 -> 페이지를 이동(뭔가행동을할때마다)할떄마다 10초가 리셋됨
	
		
	session.setAttribute("name", "김훈종"); // 값을 넣을때 : set / 속성 : Attribute
	
	response.sendRedirect("Ex06main.jsp"); // 값넣는게 끝났으니 다시 접속해라
	
	
	
	}

}
