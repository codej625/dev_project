package com.dev.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.dev.project.serviceimpl.HjServiceImpl;

@Controller
public class HjController {

	@Autowired
	HjServiceImpl hjServiceImpl;

	@GetMapping(value = "/")
	public String name() throws Exception {
		
		return "/page/test";
	}
}
