package com.dev.project.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.dev.project.mapper.HjRestMapper;
import com.dev.project.service.HjRestService;

public class HjRestServiceImpl implements HjRestService {

    @Autowired
    HjRestMapper hjRestMapper;
}
