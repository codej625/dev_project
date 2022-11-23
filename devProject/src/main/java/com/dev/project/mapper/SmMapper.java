package com.dev.project.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.dev.project.vo.SmVo;


@Mapper
@Repository
public interface SmMapper {
	List<SmVo> selectRecordList();
}
