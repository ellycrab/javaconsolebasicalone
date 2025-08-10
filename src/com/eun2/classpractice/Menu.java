package com.eun2.classpractice;


//상품(메뉴) 클래스
public class Menu {

	String name;
	int price;
	int stock;
	
	
	
	public Menu(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	
	public boolean isAvailable() {
		return stock>0;
	}
	
	
	public void decreaseStock() {
		if(stock>0) stock--;
	}
}
