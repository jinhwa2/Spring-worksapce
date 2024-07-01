package com.khmall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.khmall.dto.Clothes;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ClothesController {

	 /***** 옷 정보를 올릴 수 있는 주소로 이동하는 GetMapping 작성하기 *****/	
	
	@GetMapping("imgUpload") //html파일과 java 파일이 만나는 공간
	public String uploadForm(Model model) {
		model.addAttribute("c", new Clothes()); //DB에 올릴 수 있는 공간을 만들어줌
	     return "imgUpload"; //html 이름
	
	}
	
	/***** 옷 정보 db에 업로드 PostMapping *****/
	@PostMapping("/upload")
	 public String uploadClothes(
			 
			 @RequestParam("clothes_name") String pig_name,
			 @RequestParam("clothes_price") int clothes_price,
			 @RequestParam("clothes_category") String clothes_category,
			 @RequestParam("clothes_image_path") MultipartFile file
			
			,Model model ) {
		Clothes
	}
			 
		
	
}
