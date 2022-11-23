package com.dev.project.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dev.project.model.HjVO;
import com.dev.project.service.HjService;
import com.dev.project.serviceimpl.HjServiceImpl;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Controller
public class HjController {

    @Autowired
    HjService hjService;
    
//    @ResponseBody
    @RequestMapping("/")
    private String selectAllList(HjVO hjVO, Model model) {
		// TODO Auto-generated method stub
    	try {
    		List<HjVO> hjList = hjService.selectAllList(hjVO);
    		model.addAttribute("hjList", hjList);
    		for(HjVO vo : hjList) {
//    			System.out.println(vo);
    		}
    		return "layout/default_layout";
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e.getMessage());
			return "layout/error_page";
		}
	}
    
    @RequestMapping("/excel")
    private ResponseEntity<Object> excelDown(HttpServletResponse response, HttpServletRequest request, HjVO hjVO, Model model) {
    	// TODO Auto-generated method stub
    	try {
    		Map<String, Object> map = new HashMap<>();
    		
    		List<HjVO> hjList = hjService.selectAllList(hjVO);
    		map.put("hjList", hjList);
    		
    		model.addAttribute("hjList", hjList);
    		
    		//excel file 
    		Workbook workbook = new HSSFWorkbook();
    		//excel sheet 
    		Sheet sheet = workbook.createSheet("조회_정보");
    		//excel title
    		String[] titleArr = {"NO", "REQ_TIME", "TIME", "IP", "DEVICE", "TERM_CODE", "ADV_OBJECT_NAME"
    							, "CONTENTS_CODE", "CONVERSION_TYPE", "DUPLICATE_FLAG", "INSU_PRICE", "MKTAGREYN"};
    		
    		//EXCEL STYLE
    		CellStyle headStyle = workbook.createCellStyle();
    		headStyle.setFillForegroundColor(HSSFColor.BLUE_GREY.index);
//    		headStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
//    		headStyle.setAlignment(HorizontalAlignment.CENTER);
//    		headStyle.setBorderTop(BorderStyle.THIN);
    		
    		//FONT
//    		Font headerFont = workbook.createFont();
//    		Font rowFont = workbook.createFont();
//    		headerFont.setFontHeightInPoints((short) 12);
//    		headerFont.setBold(true);
//    		rowFont.setFontHeightInPoints((short) 11);
//    		headStyle.setFont(headerFont);
    		
    		//CELL STYLE
    		CellStyle rowStyle = workbook.createCellStyle();
//    		DataFormat format = workbook.createDataFormat();
    		
    		response.setContentType("ms-vnd/excel");
    		response.setHeader("Content-Disposition", "attachment;filename=EwalletList.xls");
    		
    		workbook.write(response.getOutputStream());
    		
    		return new ResponseEntity(null);
    	} catch (Exception e) {
    		// TODO: handle exception
    		log.error(e.getMessage());
    	}
		return null;
    }
    


    
    
    
}
