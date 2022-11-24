package com.lg.myapp;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.lg.dto.SampleDTO;

public class LombokTest {
	private static final Logger logger = LoggerFactory.getLogger(LombokTest.class);
	
	@Test
	public void testLombok() {
		SampleDTO dto = new SampleDTO();
		dto.setName("한시연");
		dto.setAge(26);
		
		logger.info(dto.toString());
	}

}
