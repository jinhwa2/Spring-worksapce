package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.dto.CafeDTO;

import lombok.extern.slf4j.Slf4j;

//@어노테이션 Controller RequestMapping Slf4j

@Controller
@RequestMapping
@Slf4j
public class CafeController {
	/*
	@PostMapping("cafe_index")
	
	public String cafeMainComment(@RequestParam("cafeCommetName") String cafeCommetName,
			                      @RequestParam("cafeCommentOpinion") String cafeCommentOpinion
	
			
			
			) {
		 log.info("블로그 댓글 작성 공간");
			
			log.debug("cafeCommetName:" +cafeCommetName);
			log.debug("cafeCommentOpinion:" +cafeCommentOpinion);
		return "redirect:/cafe/cafe_index" ;
       
	}
	
	
	
	//@어노테이션 PostMapping(만남의주소)
	//메서드 cafeMainComment
	
	//@어노테이션 RequestParam cafeCommentName cafeCommentOpinion
			//log info 로 돌와왔는지 확인
			//log debug  cafeCommentName  cageCommentOpinion 넣기
	//return redirect cafe_index로 돌아가기
*/
	//CafeDTO cafe_board
	//->@PostMappping("cafe_index") ModelAttribute 받아오기
	
	public String cafeIndexComment(CafeDTO cafeDTO) {
		
		CafeDTO cd = new CafeDTO();
		cd.getCafeCommetName();
		cd.getCafeCommetOpinion();
		
		cd.setCafeCommetName("넣어줄값 = 나중에 db연결에서 전달해줄 값 넣어줄 것");
		cd.setCafeCommetOpinion("넣어줄값 = 나중에 db연결해서 전달해줄 값 넣어줄 것");
		return "";
		
		
	}
}
