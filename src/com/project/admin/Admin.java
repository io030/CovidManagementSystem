package com.project.admin;

import java.util.Scanner;


/**
 *  Admin 클래스입니다. 관리자로 접속합니다.
 * @author 2조
 *
 */
public class Admin {
	/***
	 * 메소드입니다. 관리자 접속 단계에서 번호를 선택하여 다음 기능을 이용할 수 있습니다. (0. 돌아가기, 1. 입력)
	 */
	public static void begin() {

		boolean flag = true;
		Scanner scan = new Scanner(System.in);

		while (flag) {
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃         관리자 접속               ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃         [0] 돌아가기              ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓   ");
			System.out.println("┃         [1] 입력                  ┃   ");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛   ");

			System.out.print("번호를 입력하세요: ");
			String input = scan.nextLine();

			if (input.equals("1")) { // 입력
				ALogin.begin();
			} else if (input.equals("0")) { // 돌아가기
				flag = false;
			}

		}
	}
	
	/***
	 * 메소드 입니다. 관리자 페이지에서 번호를 선택하여 아래의 기능을 이용할 수 있습니다.
	 */
	public static void adminPage() {

		boolean flag = true;
		Scanner scan = new Scanner(System.in);

		while (flag) {
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃         관리자 페이지             ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃         [0] 돌아가기              ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓   ");
			System.out.println("┃         [1] 병원 정보 관리        ┃   ");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛   ");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓   ");
			System.out.println("┃         [2] 의료진 정보 관리      ┃   ");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛   ");

			System.out.print("번호를 입력하세요: ");
			String input = scan.nextLine();

			if (input.equals("1")) { // 입력
				AHInfo.begin();
			} else if (input.equals("2")) {
				AMSInfo.begin();
			}
			if (input.equals("0")) { // 돌아가기
				// begin();
				flag = false;
			}

		}
	}

}
