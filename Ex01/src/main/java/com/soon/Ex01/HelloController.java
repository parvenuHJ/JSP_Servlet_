package com.soon.Ex01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@GetMapping("/hello")
	@ResponseBody // -> 이 메소드의 결과가 문자열 그 자체임을 나타내는 어노테이션
	public String hello() {
		return "byebyee Spring Boot";
	}
	
}
