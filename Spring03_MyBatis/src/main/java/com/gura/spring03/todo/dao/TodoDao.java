package com.gura.spring03.todo.dao;

import java.util.List;

import com.gura.spring03.todo.dto.TodoDto;

public interface TodoDao {

	public List<TodoDto> getList();
	public void insert(TodoDto dto);
	public void delete(int num);
	public TodoDto getData(int num);
	public void update(TodoDto dto);
	
}
