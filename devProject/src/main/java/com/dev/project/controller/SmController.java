package com.dev.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.dev.project.serviceimpl.SmServiceImpl;

@Controller
public class SmController {
	
	@Autowired
	SmServiceImpl smServiceImpl;

}
