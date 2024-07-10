package com.kh.test.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.kh.test.dto.UserMember;

@Mapper
public interface UserMemberMapper {
      void insertUserMember(UserMember userMember);
}
