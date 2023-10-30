package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Logout extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		// 세션 이름을 써서 하나씩 지우는거
		session.removeAttribute("id");
		// 세션 자체를 다 없애는거
		// session.invalidate();
		
		response.sendRedirect("loginForm.html");
	
	
	}

}
