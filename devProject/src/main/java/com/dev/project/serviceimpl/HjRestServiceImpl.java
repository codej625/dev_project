package com.dev.project.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.project.mapper.HjRestMapper;
import com.dev.project.service.HjRestService;

@Service
public class HjRestServiceImpl implements HjRestService {

	@Autowired
	HjRestMapper hjRestMapper;
}
