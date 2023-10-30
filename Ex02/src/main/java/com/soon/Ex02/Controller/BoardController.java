package com.soon.Ex02.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.soon.Ex02.Entity.Board;
import com.soon.Ex02.Repository.BoardRepository;
import com.soon.Ex02.Service.BoardService;

import lombok.RequiredArgsConstructor;

// @RequiredArgsConstructor - final이 붙은 속성을 포함하는 생성자를 자동으로 생성해줌 Autowired와 같은 역할 (의존성주입) 
@RequiredArgsConstructor
@Controller
public class BoardController {
	
	// 의존성 주입
	@Autowired
	private BoardService boardService;
	// private BoardRepository boardRepository; 
	// 컨트롤러에서 안하고 Service에서 받아오기로함
	

	@GetMapping("/board")
	public String boardHome(Model model){

		List<Board> boardList = this.boardService.selectList(); // findAll ->테이블의 모든 데이터를 조회 = select * from 테이블
		
		model.addAttribute(boardList);
		
		return "board_home";
	}
	
	// 게시글 상세조회
	@GetMapping("/board/detail/{boardNum}")
	public String boardDetail(Model model, @PathVariable("boardNum") Integer boardNum) {
		
		return "board_detail";
	}
	
	
	
}
