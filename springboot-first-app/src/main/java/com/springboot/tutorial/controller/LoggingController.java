package com.springboot.tutorial.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;


@RestController
public class LoggingController {
	Logger logger = LoggerFactory.getLogger(LoggingController.class);
	
	@RequestMapping("/log")
	public Map<String, String> getLogs() {
		Map<String, String> map = new HashMap<>();
		map.put("name", "Rishab");
		logger.info("This is an info msg");
		logger.warn("This is a warn msg");
		logger.error("This is an error msg");
		logger.debug("This is a debug msg");
		return map;
	}
}
