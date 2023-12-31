package com.smhrd.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex06Join")
public class Ex06Join extends HttpServlet {

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 회원가입에 작성한 데이터를 콘솔에 출력하기
		
		// post 방식은 각각 servlet마다 인코딩을 해줘야함
		// post 방식의 인코딩
		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String nick = request.getParameter("nick");
		String gender = request.getParameter("gender");
		// getParameter -> 동일한 name으로 하면 첫번째 값만 가져옴
		// String hobby = request.getParameter("hobby");
		
		// 동일한 name으로 여러개의 값을 가져오는 방법
		// getParameterValues -> 리턴타입 : 배열
		String[] hobby = request.getParameterValues("hobby");
		
		System.out.println(id);
		System.out.println(pw);
		System.out.println(nick);
		System.out.println(gender);
		
		for(int i = 0 ; i < hobby.length; i++) {
			System.out.println(hobby[i]);
		}
		
		
	}

}
