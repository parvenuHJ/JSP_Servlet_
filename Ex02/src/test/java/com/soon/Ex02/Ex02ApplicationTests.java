package com.soon.Ex02;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.soon.Ex02.Entity.Board;

import Repository.BoardRepository;


@SpringBootTest  // 여기가 스프링부트 테스트 하는 곳이다 라는걸 알려줌
class Ex02ApplicationTests {
	
	
	@Autowired //@Autowired를 안쓰면 new BoardRepository 이런식으로 써야됨  // 의존성을 주입해줌			  
	private BoardRepository boardRepository;

	
	// 테스트 코드를 실행할 때는 서버를 닫아줘야함!!!! // run as junit test
	// 테스트 코드를 실행할 때는 같은 패키지에 있어야 함!!! 
	@Test // 아래를 테스트 할때 사용할 것이다라는걸 알려줌
	void contextLoads() {
		Board b1 = new Board();
		b1.setBoardTitle("스프링부트가 뭐냐?");
		b1.setBoardCon("그게뭔데?");
		b1.setBoardDate(LocalDateTime.now());// LocalDateTime.now() = sysdate
		this.boardRepository.save(b1); // this. -> 위에 있는 boardRepository 라고 알려주는 것임 헷갈릴수도 잇으니까 알려줌
										// .save -> jpa레파지토리에서 제공하는 메소드 
		
		
		Board b2 = new Board();
		b2.setBoardTitle("스프링부트 좋다");
		b2.setBoardCon("굳굳");
		b2.setBoardDate(LocalDateTime.now());
		this.boardRepository.save(b2);
		
		
		
		
	}

}
