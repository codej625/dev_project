package com.dev.project.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dev.project.service.SmService;
import com.dev.project.vo.SmVo;

@Controller
public class SmController {
	
	@Autowired
	SmService smService;
	
	@GetMapping({"","/"})
	//@RequestMapping(value="/default_SmLayout", method=RequestMethod.GET)
	public String selectRecordList(Model model, SmVo smVo) {
		model.addAttribute("list",smService.selectRecordList());
		return "layout/default_SmLayout";
	}

	@RequestMapping("/excel")
	   public ResponseEntity<Object> downloadExcel(Model model, HttpServletResponse response, HttpServletRequest request, SmVo smVo) throws Exception{

	      Map<String, Object> retVal = new HashMap<>();

	      int rowNo = 0;

	      List<SmVo> recordList = smService.selectRecordList();         

	      return new ResponseEntity<>(retVal, HttpStatus.OK);
	   }

}
