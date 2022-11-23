package com.dev.project.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.project.mapper.SmMapper;
import com.dev.project.service.SmService;

@Service
public class SmServiceImpl implements SmService {

	@Autowired
	SmMapper smMapper;
}
