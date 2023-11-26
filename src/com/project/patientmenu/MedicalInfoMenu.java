package com.project.patientmenu;

import java.util.Scanner;

/***
 * 
 * MedicalInfoMenu 클래스입니다. 환자의 진료 정보를 조회할 수 있는 메뉴입니다.
 * @author 2조
 *
 */
public class MedicalInfoMenu {
	
	/***
	 * 메소드입니다. 환자의 번호를 입력받아 환자의 진료 정보를 조회할 수 있는 메뉴입니다.
	 * @param pNumber 환자 번호
	 */
	public static void begin(int pNumber) {

		boolean flag = true;
		Scanner scan = new Scanner(System.in);

		while (flag) {

			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃         [0] 돌아가기              ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓   ");
			System.out.println("┃         [1] 진료 기록 확인        ┃   ");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛   ");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓   ");
			System.out.println("┃         [2] 처치 결과 확인        ┃   ");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛   ");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓   ");
			System.out.println("┃         [3] 중증도 정보 확인      ┃   ");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛   ");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓   ");
			System.out.println("┃         [4] 처방약 정보 확인      ┃   ");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛   ");

			System.out.print("번호를 입력하세요: ");
			String input = scan.nextLine();

			if (input.equals("1")) { // 진료 기록 확인

				CheckMedicalRecords.begin(pNumber);

			} else if (input.equals("2")) { // 처치 결과 확인

				CheckTreatmentResult.begin(pNumber);

			} else if (input.equals("3")) { // 중증도 정보 확인

				SevertityInfo.begin(pNumber);

			} else if (input.equals("4")) { // 처방약 정보 확인

				MedicineInfo.begin(pNumber);

			} else if (input.equals("0")) { // 돌아가기
				flag = false;

			} // if

		} // while

	}

}










