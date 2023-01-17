package com.example.demo.services.impl;

import org.springframework.stereotype.Service;
import com.example.demo.service.IHomeService;

@Service
public class HomeServicesimpl implements IHomeService {
	public String getMessage()
	{
		return "Welcome Service";
	}
	
	

}
