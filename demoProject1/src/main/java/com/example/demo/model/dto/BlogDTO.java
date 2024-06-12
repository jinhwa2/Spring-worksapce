package com.example.demo.model.dto;

import lombok.*;

//@어노테이션 이용해서 constructor, getter, setter, tostring
@NoArgsConstructor
@Getter
@Setter
@ToString

public class BlogDTO {
	private String commentName;
	private String commentOpinion;

}
