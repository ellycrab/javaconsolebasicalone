package com.eun.kr;

import java.util.Scanner;

public class javapractice_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//������
		int appleJuiceStock = 5;
        int orageJuiceStock = 5;
        int pineAppleJuiceStock = 5;
        int peachJuiceStock = 5;
        int cokeStock = 5;
		
        //�ܾ��� �ۿ��� �����Ͽ� ��� ����
		int balance = 0;

		// ���Ǳ� ���α׷�
		while (true) {

			
			if(balance == 0) {
				System.out.print("���� �Ա����ּ���.:");
				String inputMoney = sc.nextLine();
				balance = Integer.parseInt(inputMoney); //�Ա��� �ݾ��� balance�� �Ҵ�
			}

	
			
			// �޴� ����
			int appleJuice = 500;
			int orageJuice = 200;
			int pineAppleJuice = 200;
			int peachJuice = 100;
			int coke = 700;

	

			
			

			// �޴� ���úκ�
			System.out.println("=====================================�޴��� �������ּ���.====================================");
			System.out.println("1. ����ֽ�(500��)  2. ������ �ֽ�(200��) 3. ���ξ��� ����(200��) 4. �������ֽ�(100��) 5. �ݶ�(700��)");

			int menu = Integer.parseInt(sc.nextLine());

			switch (menu) {

			case 1:
				
				if(appleJuiceStock>0) {//��� �ֽ��� ��� �ִٸ�? > �ܰ���� �ܾ� ����
					if(balance>=appleJuice) {
						System.out.println("��� �ֽ��� �������ּ̽��ϴ�.");
						balance -= appleJuice;
						appleJuiceStock--;
						System.out.println("���� �ܾ�:"+balance);
						System.out.println("���� ����ֽ� ���:"+appleJuiceStock);
					}else {
						System.out.println("�ܾ��� �����մϴ�.");
					}
				}else {
					System.out.println("��� �ֽ��� ��� �����մϴ�.");
				}
				
				break;

			case 2:
				if(orageJuiceStock>0) {//orange �ֽ��� ��� �ִٸ�? > �ܰ���� �ܾ� ����
					if(balance>=orageJuice) {
						System.out.println("orange �ֽ��� �������ּ̽��ϴ�.");
						balance -= orageJuice;
						orageJuiceStock--;
						System.out.println("���� �ܾ�:"+balance);
						System.out.println("���� �������ֽ� ���:"+orageJuiceStock);
					}else {
						System.out.println("�ܾ��� �����մϴ�.");
					}
				}else {
					System.out.println("orange �ֽ��� ��� �����մϴ�.");
				}
				
				break;

			case 3:
				if(pineAppleJuiceStock>0) {//pineAppleJuice �ֽ��� ��� �ִٸ�? > �ܰ���� �ܾ� ����
					if(balance>=pineAppleJuice) {
						System.out.println("pineAppleJuice �ֽ��� �������ּ̽��ϴ�.");
						balance -= pineAppleJuice;
						pineAppleJuiceStock--;
						System.out.println("���� �ܾ�:"+balance);
						System.out.println("���� ���ξ����ֽ� ���:"+pineAppleJuiceStock);
					}else {
						System.out.println("�ܾ��� �����մϴ�.");
					}
				}else {
					System.out.println("pineAppleJuice �ֽ��� ��� �����մϴ�.");
				}
				
				break;

			case 4:
				if(peachJuiceStock>0) {//peachJuice �ֽ��� ��� �ִٸ�? > �ܰ���� �ܾ� ����
					if(balance>=peachJuice) {
						System.out.println("peachJuice �ֽ��� �������ּ̽��ϴ�.");
						balance -= peachJuice;
						peachJuiceStock--;
						System.out.println("���� �ܾ�:"+balance);
						System.out.println("���� peach�ֽ� ���:"+peachJuiceStock);
					}else {
						System.out.println("�ܾ��� �����մϴ�.");
					}
				}else {
					System.out.println("peachJuice �ֽ��� ��� �����մϴ�.");
				}
				
				break;

			case 5:
				if(cokeStock>0) {//coke�� ��� �ִٸ�? > �ܰ���� �ܾ� ����
					if(balance>=coke) {
						System.out.println("coke�� �������ּ̽��ϴ�.");
						balance -= coke;
						cokeStock--;
						System.out.println("���� �ܾ�:"+balance);
						System.out.println("���� �ݶ����:"+cokeStock);
					}else {
						System.out.println("�ܾ��� �����մϴ�.");
					}
				}else {
					System.out.println("coke�� ��� �����մϴ�.");
				}
				
				break;

			default:
				System.out.println("�޴��� �ٽ� �������ּ���.");
				continue;
			}//switch

			System.out.println("������ �޴���ȣ: " + menu);
			
			
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
