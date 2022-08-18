package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.request.ApiRequest;
import com.example.demo.service.ApiService;

@RestController
@RequestMapping("/apitest")
public class APIController {
	@Autowired
	private ApiService apiservice;
	
	@PostMapping("/gentoken")
	public Object GenerateToken(@RequestBody ApiRequest request) {
		return apiservice.gentoken(request);
	}

}