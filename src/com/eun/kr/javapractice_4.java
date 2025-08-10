package com.eun.kr;

import java.util.Scanner;

public class javapractice_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//메뉴 데이터
//		String[] menuNames = {"사과주스", "오렌지주스", "파인애플주스", "복숭아주스", "콜라"};
//		int[]menuPrices = {500,200,200,100,700};
//		int[]menuStocks = {5,5,5,5,5};
		
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

			
			if(balance == 0) {
				System.out.print("돈을 입금해주세요.:");
				balance = Integer.parseInt(sc.nextLine()); //입금한 금액을 balance에 할당
			}

	

			//메뉴출력
			System.out.println("======================메뉴를 선택해주세요.=======================");
			for(int i=0;i<menuData.length;i++) {
				System.out.printf("%d. %s(%s원, 재고:%s)\n ", i + 1, menuData[i][0], menuData[i][1],menuData[i][2]);
			}
			
			System.out.println();
			

			int menu = Integer.parseInt(sc.nextLine());
			
			
			 if (menu < 1 || menu > menuData.length) {
	                System.out.println("메뉴를 다시 선택해주세요.");
	                continue;
	            }
			 
			int idx = menu - 1;
            String menuName = menuData[idx][0];
            int price = Integer.parseInt(menuData[idx][1]);
            int stock = Integer.parseInt(menuData[idx][2]);

			
			// 재고와 잔액 확인
	            if (stock > 0) {//재고가 있다면?
	                if (balance >= price) {//잔액과 가격비교
	                    System.out.println(menuName + "를 선택해주셨습니다.");
	                    balance -= price; //잔액차감
	                    stock--; //재고차감
	                    menuData[idx][2] = String.valueOf(stock); // 재고 업데이트
	                    System.out.println("현재 잔액:" + balance);
	                    System.out.println("현재 " + menuName + " 재고:" + stock);
	                } else {
	                    System.out.println("잔액이 부족합니다.");
	                }
	            } else {
	                System.out.println(menuName + "의 재고가 부족합니다.");
	            }
			 
			 
			
		
			
			
			//잔액이 0보다 적으면 다시 돈을 입금하도록 하고 반복
			if(balance < 0) {
				System.out.println("잔액이 부족하여 프로그램을 종료합니다.");
				break;
			}
			
			
			System.out.print("처음으로 다시 돌아가시겠습니까? (종료:-1입력/계속:아무 숫자 입력):");
			String continueSelection = sc.nextLine();
			
			int continueSelect = Integer.parseInt(continueSelection);
			
			if(continueSelect == -1) {
				System.out.println("자판기 프로그램 종료");
				break;
			}else {
				continue;//계속해서 다시 돈을 입금할 수 있도록 하거나 다른 메뉴 선택이 가능하게끔
			}
			
			

		} // while

	}

}
