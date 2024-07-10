package com.kh.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.kh.test.dto.UserMember;
import com.kh.test.service.RegisterService;

public class RegisterController {

	@Autowired
	private RegisterService registerService;
	
	@GetMapping("/")
	public String showForm(Model model) {
		model.addAttribute("userMember", new UserMember());
		return "index";
	}
	
	

	
}
