package com.vue.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/quiz-example")
public class QuizExampleController {
	
	@RequestMapping("/index")
	public String index(Model model) {
		return "/quiz-example/index";
	}
	

}
