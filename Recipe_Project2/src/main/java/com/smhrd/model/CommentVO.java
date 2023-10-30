package com.smhrd.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class CommentVO {
	

	@NonNull
	private String co_num;
	private String mem_id;
	private String co_text;
	private String co_img;
	private String re_code;
	
	public CommentVO( String co_num, String mem_id, String co_text, String re_code) {
		this.co_num = co_num;
		this.mem_id = mem_id;
		this.co_text = co_text;
		this.re_code = re_code;
	}
	public CommentVO(String mem_id, String co_num) {
		this.co_num = co_num;
		this.mem_id = mem_id;
	}
	public CommentVO(String co_num, String co_text, String co_img) {
		super();
		this.co_num = co_num;
		this.co_text = co_text;
		this.co_img = co_img;
	}
	public String getCo_num() {
		return co_num;
	}
	public void setCo_num(String co_num) {
		this.co_num = co_num;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getCo_text() {
		return co_text;
	}
	public void setCo_text(String co_text) {
		this.co_text = co_text;
	}
	public String getCo_img() {
		return co_img;
	}
	public void setCo_img(String co_img) {
		this.co_img = co_img;
	}
	public String getRe_code() {
		return re_code;
	}
	public void setRe_code(String re_code) {
		this.re_code = re_code;
	}
	public CommentVO(String co_num, String mem_id, String co_text, String co_img, String re_code) {
		super();
		this.co_num = co_num;
		this.mem_id = mem_id;
		this.co_text = co_text;
		this.co_img = co_img;
		this.re_code = re_code;
	}
	

	
	
	
	

}
