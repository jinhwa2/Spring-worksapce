package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class HelloController {
	
	@RequestMapping("/test") //test 요청시 처리할 메서드 매핑
	public String testMethod() {
		System.out.println("/test 요청받았는지확인");
		return "test";
	}

}
