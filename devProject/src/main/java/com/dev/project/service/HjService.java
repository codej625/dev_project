package com.dev.project.service;

import java.util.List;

import com.dev.project.model.HjVO;

public interface HjService {
	
	//전체 리스트 조회 및 일별 조
	List<HjVO> selectAllList(HjVO hjVO);
	
}
