package com.eun.kr;

import java.util.Scanner;

public class javapractice_01 {

	public static void main(String[] args) {
		{

			System.out.print("2~9사이의 숫자를 입력해주세요. (-1을 입력하면 프로그램이 종료됩니다.):");

			while (true) {
				Scanner sc = new Scanner(System.in);
				String input = sc.nextLine();

				int number = Integer.parseInt(input);
				
				if(number == -1) {
					System.out.println("프로그램을 종료하겠습니다.");
					break;
				}

				// 숫자 선택 부분
				switch (number) {
				case 2:	case 3: case 4: case 5: case 6: case 7: case 8: case 9:
					break;

				default:
					System.out.println("2~9사이의 숫자만 선택해주세요.");
					
					continue;
				}
				
				for (int i = 1; i < 10; i++) {
					System.out.println(number + "*" + i + "=" + number * i);
					
				}
				
				

			}

		}

	}
}
