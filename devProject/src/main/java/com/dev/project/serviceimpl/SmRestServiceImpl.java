package com.dev.project.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.project.mapper.SmRestMapper;
import com.dev.project.service.SmRestService;

@Service
public class SmRestServiceImpl implements SmRestService {

	@Autowired
	SmRestMapper smRestMapper;
}
