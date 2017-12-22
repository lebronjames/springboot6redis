package com.zhuowang.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhuowang.service.RedisService;

@Controller
@RequestMapping("/redis")
public class RedisController {
	private static final Logger logger = LoggerFactory.getLogger(RedisController.class);

	@Autowired
	private RedisService redisService;
	
	@ResponseBody
	@RequestMapping("/test")
	public String test(){
		redisService.test();
        return "redis success";
	}
	
	@ResponseBody
	@RequestMapping("/haha")
	public String haha(){
		return "redis success";
	}
}
