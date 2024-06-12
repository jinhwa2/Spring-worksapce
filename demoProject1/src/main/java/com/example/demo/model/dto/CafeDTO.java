package com.example.demo.model.dto;


import lombok.*;

//toString getter setter noArgs AllArgs

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CafeDTO {
	private String cafeCommetName;
	private String cafeCommetOpinion;
	
}
