package com.project.patientmenu;

import java.util.Scanner;

import com.project.login.PatientPage;

/***
 * PatientConditionInput 클래스입니다. 환자의 개인 정보 선택 메뉴입니다.
 * @author 2조
 *
 */
public class PatientConditionInput {

	/***
	 * 메소드입니다. 환자의 번호를 입력받으며, 번호를 선택하여 환자가 원하는 서비스(개인 정보 조회, 회원 탈퇴)를 이용할 수 있습니다.
	 * @param pNumber 환자 번호
	 */
	public static void begin(int pNumber) {
		// TODO Auto-generated method stub
		boolean flag = true;
		Scanner s1 = new Scanner(System.in);

		while (flag) {
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃           환자 정보 메뉴          ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃         [0] 돌아가기              ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓   ");
			System.out.println("┃         [1] 개인 정보 조회        ┃   ");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛   ");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓   ");
			System.out.println("┃         [2] 회원 탈퇴             ┃   ");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛   ");
			System.out.print("번호를 입력하세요: ");
			String input = s1.nextLine();

			if (input.equals("0")) {
				flag = false;

			} else if (input.equals("1")) {
				// 개인정보 조회로 이동
				AskPersonalId.begin(pNumber);
			} else if (input.equals("2")) {

				QuitPersonalId.begin(pNumber);
			}
		}
		// 환자 정보 메뉴
	}
}
