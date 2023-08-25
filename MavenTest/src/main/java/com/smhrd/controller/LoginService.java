package com.smhrd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.model.MemberDAO;
import com.smhrd.model.MemberDTO;


public class LoginService extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
	
		MemberDTO dto = new MemberDTO(id, pw);
		
		MemberDAO dao = new MemberDAO();
		
		MemberDTO info = dao.login(dto);
		
		if(info != null) {
			System.out.println(info.getNick() + "로그인 성공!");
		}else {
			System.out.println("로그인 실패...");
		}
		
		
		
		
	}	

}
