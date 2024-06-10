package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;

public class Hellow_world {
	@RequestMapping("/test") //test 요청시 처리할 메서드 매핑
	public String testMethod() {
		System.out.println("/test 요청받았는지확인");
		return "test";
	}

}
