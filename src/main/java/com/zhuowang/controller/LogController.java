package com.zhuowang.controller;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log")
public class LogController {
	
	private static final Logger logger = LoggerFactory.getLogger(LogController.class);

	@RequestMapping("/test")
	public String test(){
		try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
        	logger.error("InterruptedException error");
        }
        return "TEST";
	}
}
