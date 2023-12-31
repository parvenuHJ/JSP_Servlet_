package com.smhrd.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex01Print")
public class Ex01Print extends HttpServlet {

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// 서버 -> 클라이언트에게 응답해줌
		// PrintWriter : 텍스트 출력 스트림(통로)
		PrintWriter out = response.getWriter(); //.getWriter의 리턴타입 : PrintWriter
		
		// html파일을 한글문서같이 텍스트 형태(문자열)로 쓸것임
		// out.print("<html><body><h1>Hello World!</h1></body></html>");
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>Hello World!</h1>");
		out.print("</body>");
		out.print("</html>");
		
		// 경로
		// C:\Users\SMHRD\Desktop\Web(Server)\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps
		
		
	}

}
