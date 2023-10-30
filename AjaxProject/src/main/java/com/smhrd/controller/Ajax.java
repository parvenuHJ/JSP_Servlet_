package com.smhrd.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.smhrd.model.ModelVO;


public class Ajax extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// menu, price
		
		ArrayList<ModelVO> list = new ArrayList<ModelVO>();
		
		list.add(new ModelVO("바나나우유", 2000));
		list.add(new ModelVO("커피우유", 2500));
		list.add(new ModelVO("딸기우유", 3000));
		list.add(new ModelVO("파인애플우유", 5000));
	
		// Java Object -> JSON 문자열로 변환
		Gson gson = new Gson();
		
		// [ { "menu" : "바나나우유", "price" : 2000}, ... ]
		String jsonList = gson.toJson(list);
		
		// 응답할 때 한글 데이터가 깨지지 않도록 인코딩
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter out  = response.getWriter();
		out.print(jsonList);
		
		
	
	
	}

}
