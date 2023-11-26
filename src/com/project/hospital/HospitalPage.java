package com.project.hospital;

import java.util.Scanner;

/**
 * HospitalPage 클래스입니다. 이용 가능한 병실수와 병원정보를 조회합니다.
 * @author 2조
 *
 */
public class HospitalPage {

	/***
	 * 메소드입니다. 병원의 이용 가능한 병실과 병원 정보 기능을 선택할 수 있는 메뉴입니다.
	 */
	public static void begin() {

		boolean flag = true;
		Scanner scan = new Scanner(System.in);

		while (flag) {
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃       [0]   돌아가기               ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓   ");
			System.out.println("┃       [1]   이용 가능한 병실       ┃   ");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛   ");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓    ");
			System.out.println("┃       [2]   병원 정보              ┃     ");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛     ");

			System.out.println("번호를 입력하세요: ");
			String input = scan.nextLine();

			if (input.equals("1")) { // 이용 가능한 병실
				AvailableRoom.begin();
			} else if (input.equals("2")) { // 병원 정보
				HospitalInfo.begin();
			} else if (input.equals("0")) {
				flag = false;
			}
		}
	}
}
