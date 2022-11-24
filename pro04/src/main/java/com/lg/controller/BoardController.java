package com.lg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@GetMapping("list.do")
	public String getBoardList(Model model) throws Exception{
		
		return "board/boardList";
	}
	
	@GetMapping("detail.do")
	public String getBoardDetail(@RequestParam("sec") int sec, Model model)throws Exception{
		return "board/boardDetail";
	}
	
//	@GetMapping("write.do")
//	public String getBoardWrite(, Model model)throws Exception{
//		return "board/boardWrite";
//	}
	
// @Getmapping("")
}
