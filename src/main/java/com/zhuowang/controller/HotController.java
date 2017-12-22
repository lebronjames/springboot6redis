package com.zhuowang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hot")
public class HotController {

	@RequestMapping("/test")
	public String test(){
        return "TEST11111";
	}
	
	@RequestMapping("/hot")
	public String hot(){
        return "hot";
	}
}
