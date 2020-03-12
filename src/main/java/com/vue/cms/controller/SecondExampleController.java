package com.vue.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/second-example")
public class SecondExampleController {
	
	@RequestMapping("/index")
	public String index(Model model) {
		return "/second-example/index";
	}

}
