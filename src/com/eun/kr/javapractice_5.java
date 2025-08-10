package com.eun.kr;

import java.util.Scanner;

public class javapractice_5 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		

		
		String[][] menuData = {
				{"����ֽ�","500","5"},
				{"�������ֽ�","200","5"},
				{"���ξ����ֽ�","200","5"},
				{"�������ֽ�","100","5"},
				{"�ݶ�","700","5"},
				
		};
		
				
        //�ܾ��� �ۿ��� �����Ͽ� ��� ����
		int balance = 0;

		// ���Ǳ� ���α׷�
		while (true) {

			//�Ա�
			balance = depositMoney(balance);
			//�޴����
			showMenu(menuData);
			balance = processOrder(menuData, balance);
			
		
			if(!askContinue()) {
				System.out.println("���Ǳ� ���α׷� ����");
				break;
			}
		} // while

	}

	//��ӿ��� ����
	private static boolean askContinue() {
		System.out.print("ó������ �ٽ� ���ư��ڽ��ϱ�? (����:-1/���:�ٸ� ����):");
		int next = Integer.parseInt(sc.nextLine());
		return next != -1;
	}

	//�ֹ�ó��
	private static int processOrder(String[][] menuData, int balance) {
		int menu = Integer.parseInt(sc.nextLine());
		if(menu<1 || menu>menuData.length) {
			System.out.println("�߸��� ��ȣ �Դϴ�.");
			return balance;
		}
		
		
		int index = menu - 1;
		String name = menuData[index][0];
		int price =  Integer.parseInt(menuData[index][1]);
		int stock = Integer.parseInt(menuData[index][2]);
		
		if(stock > 0) {//��� ����
			if(balance >= price) {
				System.out.println(name + " �� �����ϼ̽��ϴ�.");
				balance -= price;
				stock--;
				menuData[index][2] = String.valueOf(stock);
				System.out.println("���� �ܾ�: "+balance);
			}else {
				System.out.println("�ܾ� ����");
			}
			
		}else {
			System.out.println(name+"�� ��� �����ϴ�.");
		}
		
		
		
		return balance;
		
	}

	private static void showMenu(String[][] menuData) {
		
		//�޴����
		System.out.println("======================�޴��� �������ּ���.=======================");
		for(int i=0;i<menuData.length;i++) {
			System.out.printf("%d. %s(%s��, ���:%s)\n ", i + 1, menuData[i][0], menuData[i][1],menuData[i][2]);
		}
	}

	//�Ա�ó��
	 static int depositMoney(int balance) {

		 if (balance == 0) {
	            System.out.print("���� �Ա����ּ���.:");
	            balance = Integer.parseInt(sc.nextLine());
	        }
	        return balance;
	}


}
