package com.dev.project.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class HjVO {

	//idx
	private String id;
	
	//no
	private String no;
	
	//time
//	private Integer req_time;
	private String req_time;
	private String time;
	
	//ip
	private	String ip;
	
	//dwvice
	private String device;
	
	//adv_object_code
	private String adv_object_code;
	
	//adv_object_name
	private String adv_object_name;
	
	//adv_subject_id
	private String adv_subject_id;
	
	//source_code
	private String source_code;
	
	//medium_code
	private String medium_code;
	
	//medium_code
	private String campaign_code;
	
	//contents_code
	private String contents_code;
	
	//term_code
	private String term_code;
	
	//name
	private String name;
	
	//birthday
	private String birthday;
	
	//gender
	private String gender;
	
	//mobile
	private String mobile;
	
	//conversion_type
	private String conversion_type;
	
	//visit_log_id
//	private Integer visit_log_id;
	private String visit_log_id;

	//visit_log_id
//	private Integer visit_time;
	private String visit_time;
	
	//visit_log_id
	private String duplicate_flag;
	
	//visit_log_id
	private String insu_price;
	
	//visit_log_id
	private String duplicate_flag2;
	
	//mktagreyn
//	private Integer mktagreyn;
	private String mktagreyn;

	//date1 
	private String date1;
	
	//date2 
	private String date2;
	
	
}
