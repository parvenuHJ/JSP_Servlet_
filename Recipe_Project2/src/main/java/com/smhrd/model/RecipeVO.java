package com.smhrd.model;


import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class RecipeVO {
    private String re_code;
    private String re_name;
    private String food_name;
    private String re_per;
    private String re_time;
    private String re_level;
    private String re_url;
    private int re_like;
	public RecipeVO(String re_code, String re_name, String food_name, String re_per, String re_time, String re_level,
			String re_url, int re_like) {
		super();
		this.re_code = re_code;
		this.re_name = re_name;
		this.food_name = food_name;
		this.re_per = re_per;
		this.re_time = re_time;
		this.re_level = re_level;
		this.re_url = re_url;
		this.re_like = re_like;
	}
	public String getRe_code() {
		return re_code;
	}
	public void setRe_code(String re_code) {
		this.re_code = re_code;
	}
	public String getRe_name() {
		return re_name;
	}
	public void setRe_name(String re_name) {
		this.re_name = re_name;
	}
	public String getFood_name() {
		return food_name;
	}
	public void setFood_name(String food_name) {
		this.food_name = food_name;
	}
	public String getRe_per() {
		return re_per;
	}
	public void setRe_per(String re_per) {
		this.re_per = re_per;
	}
	public String getRe_time() {
		return re_time;
	}
	public void setRe_time(String re_time) {
		this.re_time = re_time;
	}
	public String getRe_level() {
		return re_level;
	}
	public void setRe_level(String re_level) {
		this.re_level = re_level;
	}
	public String getRe_url() {
		return re_url;
	}
	public void setRe_url(String re_url) {
		this.re_url = re_url;
	}
	public int getRe_like() {
		return re_like;
	}
	public void setRe_like(int re_like) {
		this.re_like = re_like;
	}
    
    
    
}
