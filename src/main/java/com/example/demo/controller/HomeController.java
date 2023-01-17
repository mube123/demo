package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.IHomeService;

@RestController
public class HomeController {
	
	@Autowired
	IHomeService homeService;
	
	@GetMapping(path="/message")
		public String getMessage() 
	{
		return "Welcome to the message";
	}
	
	@GetMapping(path="/feedback")
	public String getFeedback() 
	{
		return "Welcome to the feedback";
	}
	
	@GetMapping(path="/search/query")
	public String getSearch() 
	{
		return "Welcome to the search";
	}


}
