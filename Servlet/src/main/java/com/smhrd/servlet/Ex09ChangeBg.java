package com.smhrd.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex09ChangeBg")
public class Ex09ChangeBg extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	String color = request.getParameter("color");
	System.out.println(color);
	
	PrintWriter out = response.getWriter();
	
	out.print("<html>");
	out.print("<body bgcolor='"+color+"'>"); // '"+color+"' 를 "+color+"해도 되긴하는데 원래는 '"+color+"' 가 맞음.
	out.print("</body>");
	out.print("</html>");
	}

}
