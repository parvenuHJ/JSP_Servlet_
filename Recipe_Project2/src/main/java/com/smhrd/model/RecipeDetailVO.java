package com.smhrd.model;

import lombok.Data;

@Data
public class RecipeDetailVO {
	
	private String re_code;
	private String de_text;
	private String de_url;
	public RecipeDetailVO(String re_code, String de_text, String de_url) {
		super();
		this.re_code = re_code;
		this.de_text = de_text;
		this.de_url = de_url;
	}
	public String getRe_code() {
		return re_code;
	}
	public void setRe_code(String re_code) {
		this.re_code = re_code;
	}
	public String getDe_text() {
		return de_text;
	}
	public void setDe_text(String de_text) {
		this.de_text = de_text;
	}
	public String getDe_url() {
		return de_url;
	}
	public void setDe_url(String de_url) {
		this.de_url = de_url;
	}

	
	
	
}
