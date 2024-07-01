package com.example.demo.dto;

import lombok.*;
/*lombok활용한 Getter Setter 기초생성자 필수생성자 toString만들기*/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Goods {
	private String goodsName;
	private int goodsPrice;
	private int goodsQuantity;
}
