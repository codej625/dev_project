package com.dev.project.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.dev.project.mapper.SmMapper;
import com.dev.project.service.SmService;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class SmServiceImpl implements SmService {

    @Autowired
    SmMapper smMapper;

}
