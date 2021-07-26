package com.gura.spring03.todo.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gura.spring03.todo.dto.TodoDto;

// 스프링이 객체를 생성하고 spring bean container 에서 관리하도록 어노테이션을 붙여준다.
@Repository
public class TodoDaoImpl implements TodoDao{
	
	@Autowired
	private SqlSession session;
	
	@Override
	public List<TodoDto> getList() {
		
		List<TodoDto> list = session.selectList("todo.getList");
		
		return list;
	}

	@Override
	public void insert(TodoDto dto) {
		session.insert("todo.insert", dto);
	}

	@Override
	public void delete(int num) {
		session.delete("todo.delete", num);
	}

	@Override
	public TodoDto getData(int num) {
		TodoDto dto=session.selectOne("todo.getData", num);
		return dto;
	}

	@Override
	public void update(TodoDto dto) {
		session.update("todo.update", dto);
	}

}
