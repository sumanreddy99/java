package com.seleniumexpress.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestContoller {
	
	
	@RequestMapping("/test")
	
	public String getHome() {
		
		return "hello";
	}

}
