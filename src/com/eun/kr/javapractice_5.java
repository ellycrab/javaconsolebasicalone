package com.eun.kr;

import java.util.Scanner;

public class javapractice_5 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		

		
		String[][] menuData = {
				{"사과주스","500","5"},
				{"오렌지주스","200","5"},
				{"파인애플주스","200","5"},
				{"복숭아주스","100","5"},
				{"콜라","700","5"},
				
		};
		
				
        //잔액을 밖에서 선언하여 계속 누적
		int balance = 0;

		// 자판기 프로그램
		while (true) {

			//입금
			balance = depositMoney(balance);
			//메뉴출력
			showMenu(menuData);
			balance = processOrder(menuData, balance);
			
		
			if(!askContinue()) {
				System.out.println("자판기 프로그램 종료");
				break;
			}
		} // while

	}

	//계속여부 묻기
	private static boolean askContinue() {
		System.out.print("처음으로 다시 돌아가겠습니까? (종료:-1/계속:다른 숫자):");
		int next = Integer.parseInt(sc.nextLine());
		return next != -1;
	}

	//주문처리
	private static int processOrder(String[][] menuData, int balance) {
		int menu = Integer.parseInt(sc.nextLine());
		if(menu<1 || menu>menuData.length) {
			System.out.println("잘못된 번호 입니다.");
			return balance;
		}
		
		
		int index = menu - 1;
		String name = menuData[index][0];
		int price =  Integer.parseInt(menuData[index][1]);
		int stock = Integer.parseInt(menuData[index][2]);
		
		if(stock > 0) {//재고가 있음
			if(balance >= price) {
				System.out.println(name + " 을 선택하셨습니다.");
				balance -= price;
				stock--;
				menuData[index][2] = String.valueOf(stock);
				System.out.println("현재 잔액: "+balance);
			}else {
				System.out.println("잔액 부족");
			}
			
		}else {
			System.out.println(name+"의 재고가 없습니다.");
		}
		
		
		
		return balance;
		
	}

	private static void showMenu(String[][] menuData) {
		
		//메뉴출력
		System.out.println("======================메뉴를 선택해주세요.=======================");
		for(int i=0;i<menuData.length;i++) {
			System.out.printf("%d. %s(%s원, 재고:%s)\n ", i + 1, menuData[i][0], menuData[i][1],menuData[i][2]);
		}
	}

	//입금처리
	 static int depositMoney(int balance) {

		 if (balance == 0) {
	            System.out.print("돈을 입금해주세요.:");
	            balance = Integer.parseInt(sc.nextLine());
	        }
	        return balance;
	}


}
