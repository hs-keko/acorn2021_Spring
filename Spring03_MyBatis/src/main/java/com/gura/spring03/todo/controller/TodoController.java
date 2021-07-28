package com.gura.spring03.todo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gura.spring03.member.dto.MemberDto;
import com.gura.spring03.todo.dao.TodoDao;
import com.gura.spring03.todo.dto.TodoDto;
import com.gura.spring03.todo.service.TodoService;

@Controller
public class TodoController {
	
	@Autowired
	private TodoService service;
	
	//할 일 수정 요청 처리
	@RequestMapping("/todo/update")
	public ModelAndView update(TodoDto dto, ModelAndView mView) {
		//할 일 정보를 수정하고
		service.updateTodo(dto);
		
		//ModelAndView 에 msg 라는 키값으로 메세지를 담고
		mView.addObject("msg", dto.getNum()+"번 할일 정보를 수정했습니다.");
		// view page 정보도 담아서
		mView.setViewName("todo/alert");
		// 리턴해준다.
		return mView;
	}
	
	//할 일 수정 폼 요청 처리
	@RequestMapping("/todo/updateform")
	public ModelAndView updateform(@RequestParam int num, ModelAndView mView) {
		//TodoService 를 이용해서 ModelAndView 객체에 할 일의 정보가 담기게 한다.
		service.getTodo(num, mView);
		//view  page 정보도 담고
		mView.setViewName("todo/updateform");
		//ModelAndView 객체를 리턴해 준다.
		return mView;
		}
	
	//할 일 삭제 메소드
	@RequestMapping("/todo/delete")
	public String delete(@RequestParam int num) {
		
		//할 일 정보 삭제하고
		service.deleteTodo(num);
		//리다일렉트 이동
		return "redirect:/todo/list.do";
	}
	
	//할 일 추가 요청 처리
	@RequestMapping("/todo/insert")
	public ModelAndView insert(TodoDto dto, ModelAndView mView) {
		// 폼 전송된 파라미터가 TodoDto 객체에 담겨서 전달된다.
		service.addTodo(dto);
		
		// ModelAndView 객체에 msg 라는 키값으로 문자열을 담고
		mView.addObject("msg", "할 일의 정보를 추가 했습니다.");
		// view page 정보를 담고
		mView.setViewName("todo/alert");
		// ModelAndView 객체를 리턴해 준다.
		return mView;
	}
	
	//할 일 추가 폼 요청 처리
	@RequestMapping("/todo/insertform")
	public String insertform() {
		//할 일 추가 폼으로 forward 이동만 시켜주면 된다.
		return "todo/insertform";
	}
	
	@RequestMapping("/todo/list")
	public ModelAndView list(ModelAndView mView) {
		//TodoService 에 ModelAndView 객체의 참조값을 전달해서 할 일 목록이 담기게 한다.
		service.getListTodo(mView);
		//ModelAndView 객체에 view page 의 정보를 담고
		mView.setViewName("todo/list");
		//리턴해준다.
		return mView;
	}
}
