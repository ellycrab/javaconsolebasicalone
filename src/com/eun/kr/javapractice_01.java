package com.eun.kr;

import java.util.Scanner;

public class javapractice_01 {

	public static void main(String[] args) {
		{

			System.out.print("2~9������ ���ڸ� �Է����ּ���. (-1�� �Է��ϸ� ���α׷��� ����˴ϴ�.):");

			while (true) {
				Scanner sc = new Scanner(System.in);
				String input = sc.nextLine();

				int number = Integer.parseInt(input);
				
				if(number == -1) {
					System.out.println("���α׷��� �����ϰڽ��ϴ�.");
					break;
				}

				// ���� ���� �κ�
				switch (number) {
				case 2:	case 3: case 4: case 5: case 6: case 7: case 8: case 9:
					break;

				default:
					System.out.println("2~9������ ���ڸ� �������ּ���.");
					
					continue;
				}
				
				for (int i = 1; i < 10; i++) {
					System.out.println(number + "*" + i + "=" + number * i);
					
				}
				
				

			}

		}

	}
}
