package com.eun2.classpractice;

public class Main {

	//실행 진입점
	public static void main(String[] args) {
		  Menu[] menus = {
	                new Menu("사과주스", 500, 5),
	                new Menu("오렌지주스", 200, 5),
	                new Menu("파인애플주스", 200, 5),
	                new Menu("복숭아주스", 100, 5),
	                new Menu("콜라", 700, 5)
	        };
		  
		  VendingMachine vm = new VendingMachine(menus);
		  vm.start();

	}

}
