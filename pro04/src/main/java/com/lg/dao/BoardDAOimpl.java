package com.lg.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lg.dto.BoardDTO;

@Repository
public class BoardDAOimpl implements BoardDAO {
		
		@Autowired
		private SqlSession sqlSession;

		@Override
		public List<BoardDTO> boardList() throws Exception {
			return sqlSession.selectList("board.boardList");
		}

		@Override
		public BoardDTO boardDetail(int seq) throws Exception {
			return sqlSession.selectOne("board.boardDetail");
	}

}
