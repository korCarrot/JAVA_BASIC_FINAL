package com.myspring.pro28.ex05;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

	private static final Logger logger = LoggerFactory.getLogger(LocaleInterceptor.class);
	
	@RequestMapping(value = "/main.do", method = RequestMethod.GET)
	String main() throws Exception{
		logger.info("MyController ");
		return "locale";
	}
	
}
