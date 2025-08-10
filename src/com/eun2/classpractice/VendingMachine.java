package com.eun2.classpractice;

import java.util.Scanner;

//자판기 동작 클래스
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
				System.out.println("자판기 프로그램 종료");
				break;
			}
		}
	}


	private boolean askContinue() {
		System.out.print("계속하시겠습니까? (종료:-1 / 계속:다른 숫자): ");
        int next = Integer.parseInt(sc.nextLine());
        return next != -1;
	}


	private void processOrder() {
		int choice = Integer.parseInt(sc.nextLine());
        if (choice < 1 || choice > menus.length) {
            System.out.println("잘못된 번호입니다.");
            return;
        }

        Menu selected = menus[choice - 1];

        if (!selected.isAvailable()) {
            System.out.println(selected.name + "의 재고가 없습니다.");
            return;
        }

        if (balance >= selected.price) {
            System.out.println(selected.name + "를 선택하셨습니다.");
            balance -= selected.price;
            selected.decreaseStock();
            System.out.println("현재 잔액: " + balance);
        } else {
            System.out.println("잔액이 부족합니다.");
        }
		
	}


	private void showMenu() {
		System.out.println("===== 메뉴를 선택해주세요 =====");
        for (int i = 0; i < menus.length; i++) {
            System.out.printf("%d. %s(%d원, 재고:%d)\n",
                    i + 1, menus[i].name, menus[i].price, menus[i].stock);
        }
		
	}


	private void depositMoney() {
		if (balance == 0) {
            System.out.print("돈을 입금해주세요.: ");
            balance = Integer.parseInt(sc.nextLine());
        }
		
	}
	
	
}
