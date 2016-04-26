package com.br.sestaro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RpgProjectController {

	@RequestMapping(value="/controller", method=RequestMethod.GET)
	@ResponseBody
	public String showMessage() {
		return "It's alive";
	}
}
