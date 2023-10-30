package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");

		System.out.println(id);
		
		String checkID = "smart";
		String checkPW = "1234";

		if(id.equals(checkID) && pw.equals(checkPW)) {
			
			HttpSession session = request.getSession();
			// 세션에 저장
			session.setAttribute("id", id);
			
			System.out.println(session.getAttribute("id"));
			
			response.sendRedirect("main.jsp");
			
		} else {
			response.sendRedirect("loginForm.html");
		}
	}

}
