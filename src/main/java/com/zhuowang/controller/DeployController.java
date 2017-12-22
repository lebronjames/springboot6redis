package com.zhuowang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deploy")
public class DeployController {

	@RequestMapping("/test")
	public String test(){
		return "DeployController##test()";
	}
}
