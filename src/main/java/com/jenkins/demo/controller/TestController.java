package com.jenkins.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	
	
	@ResponseBody
	@RequestMapping("/testHello")
	public String testHello() {
		return "hello jenkins";
	}

}
