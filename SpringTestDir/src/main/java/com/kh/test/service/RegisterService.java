package com.kh.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.test.dto.UserMember;
import com.kh.test.mapper.UserMemberMapper;

@Service
public class RegisterService {
	@Autowired
	private UserMemberMapper  userMemberMapper;
	
	public void insertUserMember(UserMember userMember) {
		userMemberMapper.insertUserMember(userMember);
	}
    
    
     
     
}
