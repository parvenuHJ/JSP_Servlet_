package com.smhrd.model;

import lombok.Data;

@Data
public class IngrementVO {

	private String re_name;
	private String ingre_code;
	private String ingre_name;
	public IngrementVO(String re_name, String ingre_code, String ingre_name) {
		super();
		this.re_name = re_name;
		this.ingre_code = ingre_code;
		this.ingre_name = ingre_name;
	}
	public String getRe_name() {
		return re_name;
	}
	public void setRe_name(String re_name) {
		this.re_name = re_name;
	}
	public String getIngre_code() {
		return ingre_code;
	}
	public void setIngre_code(String ingre_code) {
		this.ingre_code = ingre_code;
	}
	public String getIngre_name() {
		return ingre_name;
	}
	public void setIngre_name(String ingre_name) {
		this.ingre_name = ingre_name;
	}
	
	
	
}
