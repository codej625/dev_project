package com.dev.project.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.dev.project.mapper.HjMapper;
import com.dev.project.model.HjVO;
import com.dev.project.service.HjService;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class HjServiceImpl implements HjService {

    @Autowired
    HjMapper hjMapper;

	@Override
	public List<HjVO> selectAllList(HjVO hjVO) {
	
//		hjMapper.selectAllList(hjVO);
		
		return hjMapper.selectAllList(hjVO);
	}

}
