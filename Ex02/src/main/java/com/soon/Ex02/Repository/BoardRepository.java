package com.soon.Ex02.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soon.Ex02.Entity.Board;

public interface BoardRepository extends JpaRepository<Board, Integer>{

	// JpaRepository - 설치한 라이브러리 기능을 사용하려고 상속받는다.
	// JpaRepository 를 상속받는 레파지토리 - DB와 연동할 수 있음
	// <대상이 되는 엔티티 타입, 해당 엔티티의 PK의 타입>
	
	
	
	
}
