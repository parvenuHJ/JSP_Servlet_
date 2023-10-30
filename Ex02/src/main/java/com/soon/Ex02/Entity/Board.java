package com.soon.Ex02.Entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Board {
	
	@Id // 프라이머리 키 임을 지정
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// @GeneratedValue -> 시퀀스를 지정 (게시글 번호를 시퀀스로 )
	// strategy - ..IDENTITY -> 이 컬럼만의 고유한 시퀀스로 생성
	private Integer boardNum;
	
	@Column(length = 200)
	private String boardTitle;
	
	private String boardCon;
	
	// LocalDateTime.now -> 현재시간 지정 가능
	private LocalDateTime boardDate;
	
	// mappedBy - 참조하는 엔티티의 속성명을 알려줌
	// 게시글과 댓글 관계  = 1:다
	@OneToMany(mappedBy = "board", cascade = CascadeType.REMOVE)
	private List<Reple> repleList;

	public Integer getBoardNum() {
		return boardNum;
	}

	public void setBoardNum(Integer boardNum) {
		this.boardNum = boardNum;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoardCon() {
		return boardCon;
	}

	public void setBoardCon(String boardCon) {
		this.boardCon = boardCon;
	}

	public LocalDateTime getBoardDate() {
		return boardDate;
	}

	public void setBoardDate(LocalDateTime boardDate) {
		this.boardDate = boardDate;
	}

	public List<Reple> getRepleList() {
		return repleList;
	}

	public void setRepleList(List<Reple> repleList) {
		this.repleList = repleList;
	}
	
	

}
