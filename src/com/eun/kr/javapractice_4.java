package com.eun.kr;

import java.util.Scanner;

public class javapractice_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//�޴� ������
//		String[] menuNames = {"����ֽ�", "�������ֽ�", "���ξ����ֽ�", "�������ֽ�", "�ݶ�"};
//		int[]menuPrices = {500,200,200,100,700};
//		int[]menuStocks = {5,5,5,5,5};
		
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

			
			if(balance == 0) {
				System.out.print("���� �Ա����ּ���.:");
				balance = Integer.parseInt(sc.nextLine()); //�Ա��� �ݾ��� balance�� �Ҵ�
			}

	

			//�޴����
			System.out.println("======================�޴��� �������ּ���.=======================");
			for(int i=0;i<menuData.length;i++) {
				System.out.printf("%d. %s(%s��, ���:%s)\n ", i + 1, menuData[i][0], menuData[i][1],menuData[i][2]);
			}
			
			System.out.println();
			

			int menu = Integer.parseInt(sc.nextLine());
			
			
			 if (menu < 1 || menu > menuData.length) {
	                System.out.println("�޴��� �ٽ� �������ּ���.");
	                continue;
	            }
			 
			int idx = menu - 1;
            String menuName = menuData[idx][0];
            int price = Integer.parseInt(menuData[idx][1]);
            int stock = Integer.parseInt(menuData[idx][2]);

			
			// ���� �ܾ� Ȯ��
	            if (stock > 0) {//��� �ִٸ�?
	                if (balance >= price) {//�ܾװ� ���ݺ�
	                    System.out.println(menuName + "�� �������ּ̽��ϴ�.");
	                    balance -= price; //�ܾ�����
	                    stock--; //�������
	                    menuData[idx][2] = String.valueOf(stock); // ��� ������Ʈ
	                    System.out.println("���� �ܾ�:" + balance);
	                    System.out.println("���� " + menuName + " ���:" + stock);
	                } else {
	                    System.out.println("�ܾ��� �����մϴ�.");
	                }
	            } else {
	                System.out.println(menuName + "�� ��� �����մϴ�.");
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
