package com.gura.spring03.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.gura.spring03.todo.dao.TodoDao;
import com.gura.spring03.todo.dto.TodoDto;

// spring bean container 에서 관리되는 객체가 되기 위해
@Service
public class TodoServiceImpl implements TodoService {

	// 의존 객체를 주입 받기 위해
	@Autowired
	private TodoDao dao;
	
	@Override
	public void addTodo(TodoDto dto) {
		dao.insert(dto);
	}

	@Override
	public void updateTodo(TodoDto dto) {
		dao.update(dto);
	}

	@Override
	public void deleteTodo(int num) {
		dao.delete(num);
	}

	@Override
	public void getTodo(int num, ModelAndView mView) {
		//인자로 전달된 할 일의 번호를 이용해서 할 일 정보를 얻어와서
		TodoDto dto=dao.getData(num);
		//ModelAndView 객체에 담아준다.
		mView.addObject("dto", dto);
	}

	@Override
	public void getListTodo(ModelAndView mView) {
		//할 일 전체의 목록을 얻어와서
		List<TodoDto> list=dao.getList();
		//ModelAndView 객체에 담아준다.
		mView.addObject("list", list);
	}

}
