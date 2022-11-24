package com.lg.dto;

import lombok.Data;

@Data
public class BoardDTO {
	private String title;
	private String content;
	private String nickname;
	private String regdate;
	private int visited;
}
