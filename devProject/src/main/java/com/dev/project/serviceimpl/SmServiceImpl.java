package com.dev.project.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.project.mapper.SmMapper;
import com.dev.project.service.SmService;
import com.dev.project.vo.SmVo;

@Service
public class SmServiceImpl implements SmService {

	@Autowired
	SmMapper smMapper;
	
	@Override
	public List<SmVo> selectRecordList() {
		List<SmVo> list = smMapper.selectRecordList();
		
		System.out.println("=========여기 : " + list);
		return list;
	}
}
