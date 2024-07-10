package com.kh.test.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserMember {
	private int us_Id;
	private String us_Email;
	// Count 결과를 받아서 저장할 변수명을 추가
	private Integer itemCount; //COUNT(*)

}
