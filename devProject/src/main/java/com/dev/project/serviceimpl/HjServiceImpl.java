package com.dev.project.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.project.mapper.HjMapper;
import com.dev.project.service.HjService;

@Service
public class HjServiceImpl implements HjService {
	
	@Autowired
	HjMapper hjMapper;

}
