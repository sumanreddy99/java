package com.home.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/mvc")
public class HomeController {

	// @ResponseBody
	@RequestMapping("/myhome")

	public String getHome(Model model) {

		// model.addAttribute("myName", "suman");

		return "newhome";
	}

	

	@RequestMapping("/proceedAction")
	public String getVilla(Model model,HttpServletRequest req) {
		
	//String orderItem=	req.getParameter("ItemName");
		
	model.addAttribute("orderItem", req.getParameter("ItemName"));
		
		return "order";
	}
 
}
