package com.csi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class ApplicationController {

	@RequestMapping(method = RequestMethod.GET)
	public String sayWelcome(ModelMap modelMap) {
		modelMap.addAttribute("message", "WELCOME TO FULL STACK JAVA DEVELOPER");
		return "welcome";
	}

	@RequestMapping(value = "/services", method = RequestMethod.GET)
	public String sayServices(ModelMap modelMap) {
		modelMap.addAttribute("message", "SOFTWARE DEVELOPMENT");
		return "welcome";
	}

	@RequestMapping(value = "/address", method = RequestMethod.GET)
	public String sayAddress(ModelMap modelMap) {
		modelMap.addAttribute("message", "INSPIRIA MALL | PUNE | MH | INDIA");
		return "welcome";
	}
	
	@RequestMapping(value = "/result", method = RequestMethod.GET)
	public String sayResult(ModelMap modelMap) {
		modelMap.addAttribute("message", "GOT OFFER FROM INFOSYS");
		return "welcome";
	}

}
