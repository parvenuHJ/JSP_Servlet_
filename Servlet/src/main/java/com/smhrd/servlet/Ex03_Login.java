package com.smhrd.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex03_Login")
public class Ex03_Login extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. 요청데이터 가져오기
		String ID = request.getParameter("ID");
		String PW = request.getParameter("PW");
		
		// 2. 웹에 출력하기
		// 응답 문서에 대한 설정
		response.setContentType("text/html; charset=UTF-8"); // html파일을 text형식으로 줄거고, charset을 UTF-8로 할거다
		
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		out.print(ID + "님 환영합니다");
		out.print("</body>");
		out.print("</html>");
	
	}

}
