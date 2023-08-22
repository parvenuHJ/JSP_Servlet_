package com.smhrd.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Ex06RemoveSession")
public class Ex06RemoveSession extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Session 만료하는 방법
		HttpSession session = request.getSession();
		
		// 1) "name"이라는 속성만 없앰
		//session.removeAttribute("name");
		
		// 2) 락커룸 자체를 없애는 느낌
		session.invalidate();
		
		response.sendRedirect("Ex06ClickSession.jsp");
		
	
	
	
	}

}
