package com.lg.myapp;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.lg.dto.MemberDTO;

public class DTOTest {
	private static final Logger logger = (Logger) LoggerFactory.getLogger(LombokTest.class);
	
	@Test
	public void testLombok() {
		MemberDTO dto = new MemberDTO();
		dto.setId("hsy");
		dto.setPw("1234");
		dto.setName("한시연");
		dto.setAddr("인천");
		dto.setTel("123123");
		dto.setPt(100);
		dto.setRegdate("2022-11-23");
		
		logger.info(dto.toString()); // 출력문 logger 
	}

}
