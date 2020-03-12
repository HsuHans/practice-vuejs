package com.vue.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/fourth-example")
public class FourthExampleController {
	
	@RequestMapping("/index")
	public String step1(Model model) {
		return "/fourth-example/index";
	}
	

}
