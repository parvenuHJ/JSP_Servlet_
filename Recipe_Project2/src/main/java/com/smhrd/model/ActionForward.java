package com.smhrd.model;

import lombok.Data;

@Data
public class ActionForward {
	
	// 이동 할 지 말 지
	private boolean isRedirect = false;
	
	// 어느 주소로 갈 건지
	private String path = null;

	public boolean isRedirect() {
		return isRedirect;
	}

	public void setRedirect(boolean isRedirect) {
		this.isRedirect = isRedirect;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
		
	

}
