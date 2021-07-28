package com.gura.spring05.users.dao;

import com.gura.spring05.users.dto.UsersDto;

public interface UsersDao {
	//인자로 전달된 아이디가 존재 하는지 여부를 리턴하는 메소드
	public boolean isExist(String inputId);
	//인자로 전달된 가입하는 회원의 정보를 DB에 저장하는 메소드
	public void insert(UsersDto dto);
}
