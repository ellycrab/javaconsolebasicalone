package com.eun2.classpractice;

import java.util.Scanner;

//���Ǳ� ���� Ŭ����
public class VendingMachine {

	private Menu[]menus;
	private int balance;
	private Scanner sc;
	
	public VendingMachine(Menu[]menus) {
		this.menus = menus;
		this.balance = 0;
		this.sc = new Scanner(System.in);
		
	}
	
	
	public void start() {
		while(true) {
			depositMoney();
			showMenu();
			processOrder();
			if(!askContinue()) {
				System.out.println("���Ǳ� ���α׷� ����");
				break;
			}
		}
	}


	private boolean askContinue() {
		System.out.print("����Ͻðڽ��ϱ�? (����:-1 / ���:�ٸ� ����): ");
        int next = Integer.parseInt(sc.nextLine());
        return next != -1;
	}


	private void processOrder() {
		int choice = Integer.parseInt(sc.nextLine());
        if (choice < 1 || choice > menus.length) {
            System.out.println("�߸��� ��ȣ�Դϴ�.");
            return;
        }

        Menu selected = menus[choice - 1];

        if (!selected.isAvailable()) {
            System.out.println(selected.name + "�� ��� �����ϴ�.");
            return;
        }

        if (balance >= selected.price) {
            System.out.println(selected.name + "�� �����ϼ̽��ϴ�.");
            balance -= selected.price;
            selected.decreaseStock();
            System.out.println("���� �ܾ�: " + balance);
        } else {
            System.out.println("�ܾ��� �����մϴ�.");
        }
		
	}


	private void showMenu() {
		System.out.println("===== �޴��� �������ּ��� =====");
        for (int i = 0; i < menus.length; i++) {
            System.out.printf("%d. %s(%d��, ���:%d)\n",
                    i + 1, menus[i].name, menus[i].price, menus[i].stock);
        }
		
	}


	private void depositMoney() {
		if (balance == 0) {
            System.out.print("���� �Ա����ּ���.: ");
            balance = Integer.parseInt(sc.nextLine());
        }
		
	}
	
	
}
