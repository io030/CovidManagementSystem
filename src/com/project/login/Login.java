package com.project.login;

import java.util.Scanner;
/***
 * Login 클래스입니다. 환자, 의료진 로그인페이지입니다.
 * @author 2조
 *
 */
public class Login {
	// 통일
	/***
	 * 메소드입니다. 환자 로그인과 의료진 로그인을 할 수 있는 기능입니다.
	 */
	public static void begin() {

		boolean flag = true;

		Scanner s1 = new Scanner(System.in);

		login : while (flag) {
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃              로그인               ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃         [0] 돌아가기              ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓   ");
			System.out.println("┃         [1] 환자 로그인           ┃   ");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛   ");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓   ");
			System.out.println("┃         [2] 의료진 로그인         ┃   ");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛   ");

			System.out.print("번호를 입력하세요: ");
			String input = s1.nextLine();

			if (input.equals("1")) {
				PatientLogin.begin();
			} else if (input.equals("2")) {
				DNSelect.begin();
			} else if (input.equals("0")) {

				//flag = false;
				break login;
				

			}

		} // while

	}// begin

}// Login