package com.eun.kr;

import java.util.Scanner;

public class javapractice_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//�޴� ������
		String[] menuNames = {"����ֽ�", "�������ֽ�", "���ξ����ֽ�", "�������ֽ�", "�ݶ�"};
		int[]menuPrices = {500,200,200,100,700};
		int[]menuStocks = {5,5,5,5,5};
		
		
//		//������
//		int appleJuiceStock = 5;
//        int orageJuiceStock = 5;
//        int pineAppleJuiceStock = 5;
//        int peachJuiceStock = 5;
//        int cokeStock = 5;
		
        //�ܾ��� �ۿ��� �����Ͽ� ��� ����
		int balance = 0;

		// ���Ǳ� ���α׷�
		while (true) {

			
			if(balance == 0) {
				System.out.print("���� �Ա����ּ���.:");
				String inputMoney = sc.nextLine();
				balance = Integer.parseInt(inputMoney); //�Ա��� �ݾ��� balance�� �Ҵ�
			}

	
			
//			// �޴� ����
//			int appleJuice = 500;
//			int orageJuice = 200;
//			int pineAppleJuice = 200;
//			int peachJuice = 100;
//			int coke = 700;

	

			//�޴����
			System.out.println("======================�޴��� �������ּ���.=======================");
			for(int i=0;i<menuNames.length;i++) {
				System.out.printf("%d. %s(%d��) ", i + 1, menuNames[i], menuPrices[i]);
			}
			
			System.out.println();
			

			int menu = Integer.parseInt(sc.nextLine());
			
			
			 if (menu < 1 || menu > menuNames.length) {
	                System.out.println("�޴��� �ٽ� �������ּ���.");
	                continue;
	            }
			 
			 int idx = menu - 1; // �迭 �ε��� ��ȯ

			
			// ���� �ܾ� Ȯ��
	            if (menuStocks[idx] > 0) {//��� �ִٸ�?
	                if (balance >= menuPrices[idx]) {//�ܾװ� ���ݺ�
	                    System.out.println(menuNames[idx] + "�� �������ּ̽��ϴ�.");
	                    balance -= menuPrices[idx]; //�ܾ�����
	                    menuStocks[idx]--; //�������
	                    System.out.println("���� �ܾ�:" + balance);
	                    System.out.println("���� " + menuNames[idx] + " ���:" + menuStocks[idx]);
	                } else {
	                    System.out.println("�ܾ��� �����մϴ�.");
	                }
	            } else {
	                System.out.println(menuNames[idx] + "�� ��� �����մϴ�.");
	            }
			 
			 
			
		
			
			
			//�ܾ��� 0���� ������ �ٽ� ���� �Ա��ϵ��� �ϰ� �ݺ�
			if(balance < 0) {
				System.out.println("�ܾ��� �����Ͽ� ���α׷��� �����մϴ�.");
				break;
			}
			
			
			System.out.print("ó������ �ٽ� ���ư��ðڽ��ϱ�? (����:-1�Է�/���:�ƹ� ���� �Է�):");
			String continueSelection = sc.nextLine();
			
			int continueSelect = Integer.parseInt(continueSelection);
			
			if(continueSelect == -1) {
				System.out.println("���Ǳ� ���α׷� ����");
				break;
			}else {
				continue;//����ؼ� �ٽ� ���� �Ա��� �� �ֵ��� �ϰų� �ٸ� �޴� ������ �����ϰԲ�
			}
			
			

		} // while

	}

}
