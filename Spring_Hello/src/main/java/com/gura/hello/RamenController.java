package com.gura.hello;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RamenController {

	@RequestMapping("/ramen")
	public String ramen(HttpServletRequest request) {
		String ramenToday="안성탕면";
		request.setAttribute("ramenToday", ramenToday);
		return "ramen";
	}
}
