package com.smhrd.servlet;

public class PhoneDTO {
	// dto를 만든이유 : 내가 필요한 다양한 타입의 데이터를 하나로 묶을 수 있게 되었음
	
	
	
	// 필드
	private String name;
	private String rank;
	private String phone;
	private String email;
	private int age;
	
	// 필드의 값을 모두 넣어야되는 생성자 만들기
	public PhoneDTO(String name, String rank, String phone, String email, int age) {
		this.name = name;
		this.rank = rank;
		this.phone = phone;
		this.email = email;
		this.age = age;
	}
	
	
	
	// alt shift s - 에서 generate getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

	
}
