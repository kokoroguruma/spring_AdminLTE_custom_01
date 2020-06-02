package com.kokoroguruma.ems;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerMain {

	@RequestMapping(value="/")
	public String event01() {

		return "/starter.html";
//		return "/event01.html";
	}


}
