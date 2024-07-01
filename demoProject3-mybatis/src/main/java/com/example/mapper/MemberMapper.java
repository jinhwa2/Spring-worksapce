package com.example.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.dto.Member;
/*
 db에 어떤 값을 보거나 넣거나 삭제하거나 수정하는 것을
 
 */
@Mapper //Mapper 라는 명칭 지정
public interface MemberMapper {
	// 멤버가 
	void insertMember(Member member);
}
