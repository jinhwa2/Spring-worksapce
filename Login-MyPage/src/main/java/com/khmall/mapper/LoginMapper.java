package com.khmall.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.khmall.dto.Member;

/*@MapperScan = 
 * mapper위치가 아예 찾아지지 않을 때
 * main메서드에 Mapper주소를 작성해주는 어노테이션
 * 사용법
 * @MapperScan("com.khmaoo.mapper.LoginMapper")메퍼 하나의매퍼 가져오기
 * @ MapperScanㄴ */
@Mapper
public interface LoginMapper {
	Member getLogin(@Param("member_name") String member_name, @Param("member_phone") String member_phone);

	// insert와 update는 void 다!
	void updateMember(Member member);

	// 공주.. 오타
	
	void deleteMember(@Param("member_id") int member_id);
	
	//select 에서 1개의 값을 볼 때는 List를 안쓰고
	//2개 이상을 값을 볼 떄는 List를 붙인다.

	List<Member> searchMembers(@Param("keyword") String keyword);
}
