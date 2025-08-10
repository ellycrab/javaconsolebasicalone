package com.eun.kr;

import java.util.Scanner;

public class javapractice_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//메뉴 데이터
		String[] menuNames = {"사과주스", "오렌지주스", "파인애플주스", "복숭아주스", "콜라"};
		int[]menuPrices = {500,200,200,100,700};
		int[]menuStocks = {5,5,5,5,5};
		
		
//		//재고관리
//		int appleJuiceStock = 5;
//        int orageJuiceStock = 5;
//        int pineAppleJuiceStock = 5;
//        int peachJuiceStock = 5;
//        int cokeStock = 5;
		
        //잔액을 밖에서 선언하여 계속 누적
		int balance = 0;

		// 자판기 프로그램
		while (true) {

			
			if(balance == 0) {
				System.out.print("돈을 입금해주세요.:");
				String inputMoney = sc.nextLine();
				balance = Integer.parseInt(inputMoney); //입금한 금액을 balance에 할당
			}

	
			
//			// 메뉴 가격
//			int appleJuice = 500;
//			int orageJuice = 200;
//			int pineAppleJuice = 200;
//			int peachJuice = 100;
//			int coke = 700;

	

			//메뉴출력
			System.out.println("======================메뉴를 선택해주세요.=======================");
			for(int i=0;i<menuNames.length;i++) {
				System.out.printf("%d. %s(%d원) ", i + 1, menuNames[i], menuPrices[i]);
			}
			
			System.out.println();
			

			int menu = Integer.parseInt(sc.nextLine());
			
			
			 if (menu < 1 || menu > menuNames.length) {
	                System.out.println("메뉴를 다시 선택해주세요.");
	                continue;
	            }
			 
			 int idx = menu - 1; // 배열 인덱스 변환

			
			// 재고와 잔액 확인
	            if (menuStocks[idx] > 0) {//재고가 있다면?
	                if (balance >= menuPrices[idx]) {//잔액과 가격비교
	                    System.out.println(menuNames[idx] + "를 선택해주셨습니다.");
	                    balance -= menuPrices[idx]; //잔액차감
	                    menuStocks[idx]--; //재고차감
	                    System.out.println("현재 잔액:" + balance);
	                    System.out.println("현재 " + menuNames[idx] + " 재고:" + menuStocks[idx]);
	                } else {
	                    System.out.println("잔액이 부족합니다.");
	                }
	            } else {
	                System.out.println(menuNames[idx] + "의 재고가 부족합니다.");
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
