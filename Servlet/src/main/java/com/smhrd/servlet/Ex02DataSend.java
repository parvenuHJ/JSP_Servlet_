package com.smhrd.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex02DataSend")
public class Ex02DataSend extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 1. 요청데이터 가져오기
		// (요청데이터를 다루기 때문에 : request 객체)
		
		String data = request.getParameter("data"); // DATA : <input type="text" name="data"> 의 name 값 가져오기
													// string값으로 리턴됨
		System.out.println(data); // 우선 콘솔창에서 확인해보기
		
		// 2. 사용자가 입력한 값을 화면에 출력하기
		// PrintWriter : 텍스트 출력하는 스트림(통로) (서버에서 클라이언트한테 출력 : response 객체)
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		out.print(data);
		out.print("</body>");
		out.print("</html>");
		
		
		
		
	
	}

}
