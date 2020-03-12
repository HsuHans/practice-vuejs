package com.vue.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/third-example")
public class ThirdExampleController {
	
	@RequestMapping("/step1")
	public String step1(Model model) {
		return "/third-example/step1";
	}
	
	@RequestMapping("/step2")
	public String step2(Model model) {
		return "/third-example/step2";
	}
	
	@RequestMapping("/step3")
	public String step3(Model model) {
		return "/third-example/step3";
	}
	

}
