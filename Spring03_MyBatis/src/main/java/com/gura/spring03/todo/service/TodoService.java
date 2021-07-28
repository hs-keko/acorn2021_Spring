package com.gura.spring03.todo.service;

import org.springframework.web.servlet.ModelAndView;

import com.gura.spring03.todo.dto.TodoDto;

public interface TodoService {
	//할 일 추가
	public void addTodo(TodoDto dto);
	//할 일 수정
	public void updateTodo(TodoDto dto);
	//할 일 삭제
	public void deleteTodo(int num);
	//할 일의 정보를 인자로 전달한 ModelAndView 객체에 담아주는 메소드
	public void getTodo(int num, ModelAndView mView);
	//할 일 전체 정보를 인자로 전달한 ModelAndView 객체에 담아주는 메소드
	public void getListTodo(ModelAndView mView);
}
