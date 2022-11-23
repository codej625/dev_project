package com.dev.project.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.dev.project.model.HjVO;

@Mapper
@Repository
public interface HjMapper {

	//전체 리스트 조회 
	List<HjVO> selectAllList(HjVO hjVO); 
	
}
