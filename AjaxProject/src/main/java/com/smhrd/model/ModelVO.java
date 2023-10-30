package com.smhrd.model;

public class ModelVO {

	private String menu;
	private int price;
	
	
	public ModelVO() {
		super();
	}
	
	
	
	public ModelVO(String menu, int price) {
		super();
		this.menu = menu;
		this.price = price;
	}

	
	
	
	
	public String getMenu() {
		return menu;
	}

	public int getPrice() {
		return price;
	}



	public void setMenu(String menu) {
		this.menu = menu;
	}



	public void setPrice(int price) {
		this.price = price;
	}

	
	
	
	
	
	
	
	
}
