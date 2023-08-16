package com.smhrd.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex08Operation")
public class Ex08Operation extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 아래는 post 방식일때만 사용
		//request.setCharacterEncoding("UTF-8");
		
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		String opr = request.getParameter("opr");
		
		// response.setContentType("text/html; charset=UTF-8"); 은 PrintWriter out = response.getWriter(); 전에 써줘야함!!!!
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		
		int result = 0;
		if(opr.equals("plus")) { 	// <option value="plus">+</option> 에서 value 값을 따로 안적으면 "+" 가 value 값임!!!!!!
			result = num1 + num2;
		}else if(opr.equals("-")) { // <option>-</option> 에서 value값을 따로 안적어줘서 "-"가 value값이 됨
			result = num1 - num2;
		}else if(opr.equals("*")) {
			result = num1*num2;
		}else if(opr.equals("/")) {
			result = num1/num2;
		}
	
		
		out.print("<html>");
		out.print("<body>");
		
		
		out.print("답은" + result);
		
		out.print("</body>");
		out.print("</html>");
		
		
		
		
		// 혹은 아래처럼 해도 됨
//		out.print("<html>");
//		out.print("<body>");
//		if(opr.equals("+")) {
//			out.print(num1 + "+" + num2 + "=" + (num1+num2));
//		} ....
//		out.print("</body>");
//		out.print("</html>");
	
	}

}
