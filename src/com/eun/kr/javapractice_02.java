package com.eun.kr;

import java.util.Scanner;

public class javapractice_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//재고관리
		int appleJuiceStock = 5;
        int orageJuiceStock = 5;
        int pineAppleJuiceStock = 5;
        int peachJuiceStock = 5;
        int cokeStock = 5;
		
        //잔액을 밖에서 선언하여 계속 누적
		int balance = 0;

		// 자판기 프로그램
		while (true) {

			
			if(balance == 0) {
				System.out.print("돈을 입금해주세요.:");
				String inputMoney = sc.nextLine();
				balance = Integer.parseInt(inputMoney); //입금한 금액을 balance에 할당
			}

	
			
			// 메뉴 가격
			int appleJuice = 500;
			int orageJuice = 200;
			int pineAppleJuice = 200;
			int peachJuice = 100;
			int coke = 700;

	

			
			

			// 메뉴 선택부분
			System.out.println("=====================================메뉴를 선택해주세요.====================================");
			System.out.println("1. 사과주스(500원)  2. 오렌지 주스(200원) 3. 파인애플 음료(200원) 4. 복숭아주스(100원) 5. 콜라(700원)");

			int menu = Integer.parseInt(sc.nextLine());

			switch (menu) {

			case 1:
				
				if(appleJuiceStock>0) {//사과 주스의 재고가 있다면? > 잔고비교후 잔액 차감
					if(balance>=appleJuice) {
						System.out.println("사과 주스를 선택해주셨습니다.");
						balance -= appleJuice;
						appleJuiceStock--;
						System.out.println("현재 잔액:"+balance);
						System.out.println("현재 사과주스 재고:"+appleJuiceStock);
					}else {
						System.out.println("잔액이 부족합니다.");
					}
				}else {
					System.out.println("사과 주스의 재고가 부족합니다.");
				}
				
				break;

			case 2:
				if(orageJuiceStock>0) {//orange 주스의 재고가 있다면? > 잔고비교후 잔액 차감
					if(balance>=orageJuice) {
						System.out.println("orange 주스를 선택해주셨습니다.");
						balance -= orageJuice;
						orageJuiceStock--;
						System.out.println("현재 잔액:"+balance);
						System.out.println("현재 오렌지주스 재고:"+orageJuiceStock);
					}else {
						System.out.println("잔액이 부족합니다.");
					}
				}else {
					System.out.println("orange 주스의 재고가 부족합니다.");
				}
				
				break;

			case 3:
				if(pineAppleJuiceStock>0) {//pineAppleJuice 주스의 재고가 있다면? > 잔고비교후 잔액 차감
					if(balance>=pineAppleJuice) {
						System.out.println("pineAppleJuice 주스를 선택해주셨습니다.");
						balance -= pineAppleJuice;
						pineAppleJuiceStock--;
						System.out.println("현재 잔액:"+balance);
						System.out.println("현재 파인애플주스 재고:"+pineAppleJuiceStock);
					}else {
						System.out.println("잔액이 부족합니다.");
					}
				}else {
					System.out.println("pineAppleJuice 주스의 재고가 부족합니다.");
				}
				
				break;

			case 4:
				if(peachJuiceStock>0) {//peachJuice 주스의 재고가 있다면? > 잔고비교후 잔액 차감
					if(balance>=peachJuice) {
						System.out.println("peachJuice 주스를 선택해주셨습니다.");
						balance -= peachJuice;
						peachJuiceStock--;
						System.out.println("현재 잔액:"+balance);
						System.out.println("현재 peach주스 재고:"+peachJuiceStock);
					}else {
						System.out.println("잔액이 부족합니다.");
					}
				}else {
					System.out.println("peachJuice 주스의 재고가 부족합니다.");
				}
				
				break;

			case 5:
				if(cokeStock>0) {//coke의 재고가 있다면? > 잔고비교후 잔액 차감
					if(balance>=coke) {
						System.out.println("coke를 선택해주셨습니다.");
						balance -= coke;
						cokeStock--;
						System.out.println("현재 잔액:"+balance);
						System.out.println("현재 콜라재고:"+cokeStock);
					}else {
						System.out.println("잔액이 부족합니다.");
					}
				}else {
					System.out.println("coke의 재고가 부족합니다.");
				}
				
				break;

			default:
				System.out.println("메뉴를 다시 선택해주세요.");
				continue;
			}//switch

			System.out.println("선택한 메뉴번호: " + menu);
			
			
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
