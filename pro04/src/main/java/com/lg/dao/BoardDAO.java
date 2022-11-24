package com.lg.dao;

import java.util.List;

import com.lg.dto.BoardDTO;

public interface BoardDAO {
	public List<BoardDTO> boardList() throws Exception;
	public BoardDTO boardDetail(int seq) throws Exception;
}
