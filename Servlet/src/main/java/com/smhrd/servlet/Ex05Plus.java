package com.smhrd.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex05Plus")
public class Ex05Plus extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// getParameter() -> 반환타입 : String
		// 그래서 받아온 값을 숫자형으로 변환 필요
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		out.print(num1+"+"+num2+"="+(num1+num2));
		out.print("<br>");
		out.printf("%d+%d=%d",num1,num2,num1+num2);
		out.print("</body>");
		out.print("</html>");
		
		
		
	}

}
