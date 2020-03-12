package com.vue.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/first-example")
public class FirstExampleController {
	
	@RequestMapping("/index")
	public String index(Model model) {
		return "/first-example/index";
	}

}
