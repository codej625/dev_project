package com.dev.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.dev.project.serviceimpl.SmServiceImpl;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Controller
public class SmController {
	
	@Autowired
	SmServiceImpl smServiceImpl;

}
