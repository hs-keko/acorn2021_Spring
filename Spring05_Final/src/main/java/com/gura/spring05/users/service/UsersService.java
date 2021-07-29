package com.gura.spring05.users.service;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;

import com.gura.spring05.users.dto.UsersDto;

public interface UsersService {
	
	public Map<String, Object> isExistId(String inputId);
	public void addUsers(UsersDto dto);
	public void loginProcess(UsersDto dto, HttpSession session);
	public void getInfo(HttpSession session, ModelAndView mView);
}
