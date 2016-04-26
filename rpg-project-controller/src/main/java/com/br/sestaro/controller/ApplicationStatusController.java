package com.br.sestaro.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationStatusController {

	@RequestMapping(value="/showStatus", method=RequestMethod.GET)
	public String showStatus() {
		return "live";
	}
}
