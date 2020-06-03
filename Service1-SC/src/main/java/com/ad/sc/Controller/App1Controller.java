package com.ad.sc.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App1Controller 
{
	
	@Autowired
	private Environment env;
	
	@GetMapping(path = "/data")
	public String getData()
	{
		return "Response from App1-SC\n\nPORT : " + env.getProperty("local.server.port");
	}
}
