package com.dev.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dev.project.serviceimpl.HjServiceImpl;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Controller
public class HjController {

    @Autowired
    HjServiceImpl hjServiceImpl;
}
