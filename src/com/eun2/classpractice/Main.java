package com.eun2.classpractice;

public class Main {

	//���� ������
	public static void main(String[] args) {
		  Menu[] menus = {
	                new Menu("����ֽ�", 500, 5),
	                new Menu("�������ֽ�", 200, 5),
	                new Menu("���ξ����ֽ�", 200, 5),
	                new Menu("�������ֽ�", 100, 5),
	                new Menu("�ݶ�", 700, 5)
	        };
		  
		  VendingMachine vm = new VendingMachine(menus);
		  vm.start();

	}

}
