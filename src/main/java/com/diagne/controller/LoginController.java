package com.diagne.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	@RequestMapping(value = "/diagne")
	@ResponseBody
	public String sayFatoudiop() {
		return "login";
	}
	
	
//	@RequestMapping(value = "/diagne")
//	public String sayFatoudiop() {
//		return "login";
//	}

}
