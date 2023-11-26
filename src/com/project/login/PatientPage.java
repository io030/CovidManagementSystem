package com.project.login;

import java.util.Scanner;

import com.project.patientmenu.CheckMedicalMenu;
import com.project.patientmenu.MedicalInfoMenu;
import com.project.patientmenu.PatientConditionInput;
import com.project.patientmenu.PatientInfo;

/***
 * 
 * PatientPage 클래스입니다. 환자페이지로 상태, 환자 정보, 진료 정보, 담당 진료진 확인을 선택할 수 있습니다.
 * @author 2조
 *
 */
public class PatientPage {
	
	/***
	 * 메소드 입니다. 환자 번호를 입력받으며, 번호를 선택하여 다음과 같은 서비스를 이용할 수 있습니다. (환자 상태 입력, 환자 정보, 진료 정보, 환자의 담당 진료진 확인)
	 * @param pNumber 환자 번호
	 */
	public static void begin(int pNumber) {

		boolean flag = true;
		Scanner scan = new Scanner(System.in);

		while (flag) {
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━┓┏━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃ [0] 돌아가기         ┃┃ [1] 환자 상태 입력   ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━┛┗━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━┓┏━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃ [2] 환자 정보 메뉴   ┃┃ [3] 진료 정보 메뉴   ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━┛┗━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃         [4] 담당 간호사 및 의사 확인         ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

			System.out.print("번호를 입력하세요: ");
			String input = scan.nextLine();

			if (input.equals("1")) { // 환자 상태 입력

				PatientInfo.begin(pNumber);

			} else if (input.equals("2")) { // 환자 정보 메뉴

				PatientConditionInput.begin(pNumber);

			} else if (input.equals("3")) { // 진료 정보 메뉴

				MedicalInfoMenu.begin(pNumber);

			} else if (input.equals("4")) { // 담당 간호사 및 의사 확인

				CheckMedicalMenu.begin(pNumber);

			} else if (input.equals("0")) {
				flag = false;

			}

		} // while

	}// main

}