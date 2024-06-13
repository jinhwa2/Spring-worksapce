package com.example.demo.controller;




import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.controller.dto.Member;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("member")
@Slf4j
public class MemberController {
  @GetMapping("memberInfo")
  public String memberInfo(Model model) {
	  
	  Member mem = new Member();
	  mem.setMemberName("000");
	  mem.setMemberPhone("010-0000-0000");
	  mem.setMemberAge(10);
	  model.addAttribute("mem", mem);
	  
	  List<Member> memList = new ArrayList<>();
	  memList.add(new Member("홍길동","010-1111-1111",10));
	  memList.add(new Member("강영희","010-2222-2222",20));
	  memList.add(new Member("김진화","010-3333-1111",10));
	  model.addAttribute("memList", memList);
	  
	  log.info("들어왔는지 확인");
	  log.debug("문제없는지 확인");
	  
	  return "member/memberInfo";
	  
	  /*
	  [31mERROR[0;39m [35m6076[0;39m [2m---[0;39m [2m[testProject2] [nio-8083-exec-4][0;39m [2m[0;39m[36mo.a.c.c.C.[.[.[/].[dispatcherServlet]   [0;39m [2m:[0;39m Servlet.service() for servlet [dispatcherServlet] in context with path [] threw exception [Request processing failed: org.thymeleaf.exceptions.TemplateInputException: Error resolving template [member/memberInfo], template might not exist or might not be accessible by any of the configured Template Resolvers] with root cause

org.thymeleaf.exceptions.TemplateInputException: Error resolving template [member/memberInfo], template might not exist or might not be accessible by any of the configured Template Resolvers
	   * 
	   * 
	   * 1.파일 위치와 이름이 제대로 된게 맞는지 확인
	   * 2.Member로 객체 이름을 작성할 경우
	   * import java.lang.reflect.Member;
	   */
  }
  
}
