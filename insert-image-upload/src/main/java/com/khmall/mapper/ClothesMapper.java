package com.khmall.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.khmall.dto.Clothes;

@Mapper
public interface ClothesMapper {
   //전체가져오기 -> List
	List<Clothes> getAllClothes();
	
	//옷정보 하나만 가져오기
	Clothes getClothesById(int clothes_id);
	
	//돼지정보 DB에 업로드하기
	public void uploadClothes(Clothes clothes);
}
