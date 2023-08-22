package com.smhrd.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Ex07AddPhone")
public class Ex07AddPhone extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// Session에 회원의 연락처 담기
		
		// 이름, 직급, 전화번호, 이메일
//		String name ;
//		String rank ;
//		String phone ;
//		String email ;
//		int age ;
		
		// 캡슐화 
		PhoneDTO dto1 = new PhoneDTO("김군순", "순상생활 대표", "010-1234-5678", "soon@gmail.com", 20);
		PhoneDTO dto2 = new PhoneDTO("김쿤순", "순생활 대표", "010-2234-5678", "soon1@gmail.com", 21);
		PhoneDTO dto3 = new PhoneDTO("김군쑨", "순상활 대표", "010-3234-5678", "soon2@gmail.com", 22);
		PhoneDTO dto4 = new PhoneDTO("김꾼순", "순상생 대표", "010-4234-5678", "soon3@gmail.com", 23);
		PhoneDTO dto5 = new PhoneDTO("김꿈순", "상생활 대표", "010-5234-5678", "soon4@gmail.com", 24);
		PhoneDTO dto6 = new PhoneDTO("김군쑹", "순활 대표", "010-6234-5678", "soon5@gmail.com", 25);
		PhoneDTO dto7 = new PhoneDTO("김꽁씅", "순상 대표", "010-7234-5678", "soon6@gmail.com", 26);
		
		ArrayList<PhoneDTO> list = new ArrayList<PhoneDTO>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		list.add(dto4);
		list.add(dto5);
		list.add(dto6);
		list.add(dto7);
		
		// String, int 타입을 모두 dto에 넣어줘서 관리
		// dto - data transfer object
		
		HttpSession session = request.getSession();
		session.setAttribute("list", list); 
		
		response.sendRedirect("Ex07Result.jsp");
		
	
	
	
	}

}
