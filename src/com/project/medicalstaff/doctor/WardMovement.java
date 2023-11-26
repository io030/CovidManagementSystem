package com.project.medicalstaff.doctor;

import java.util.Scanner;

import com.project.data.Data;
import com.project.data.DataService;
import com.project.patient.Patient;

/**
 * WardMovement 클래스입니다.
 * 병실 이동 메뉴에서 환자의 병실을 이동합니다. 
 * 
 * @author 2조
 *
 */
public class WardMovement {
//통일
	
	/**
	 * 병실 이동 메뉴에서 돌아가기, 병실 이동 기능을 선택합니다.
	 * 병실 이동 기능을 선택한 경우, 이동할 환자의 이름,생년월일, 전화번호 뒷자리를 입력하여 일치하는 환자의 병실을 이동합니다.  
	 */
	public static void wardmove() {

		boolean flag = true;
		int pNumber = 0;
		int ward = 0;
		int movingWard = 1;

		Scanner scan = new Scanner(System.in);

		// move라는 이름을 가진 while문
		move: while (flag) {
			System.out.println();
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃             병실 이동             ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃    [0] 돌아가기   [1] 병실이동    ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println();

			System.out.print("번호를 입력하세요: ");
			String sel = scan.nextLine();

			if (sel.equals("1")) {
				System.out.println();
				System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
				System.out.println("┃             병실 이동             ┃");
				System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
				System.out.println();

				System.out.print("[이동할 환자의 이름]: ");
				String pName = scan.nextLine();
				System.out.println("==========================================================");

				System.out.print("[생년월일](6자리): ");
				String pBirth = scan.nextLine();
				System.out.println("==========================================================");

				System.out.print("[전화번호 뒷자리](4자리): ");
				String pTel = scan.nextLine();
				System.out.println("==========================================================");

				if (DataService.isValid(pName, pBirth, pTel)) {
					System.out.println("입력완료");
					System.out.println("==========================================================");
					// 전화번호, 생년월일, 전화번호가 일치하는 객체(환자)의 고유번호
					pNumber = DataService.getPatientNumber(pName, pBirth, pTel);

					if (pNumber > 0 && pNumber < Data.patientList.size()) {
						// 해당 환자고유번호를 가진 객체
						Patient patient = DataService.getPatientNum1(pNumber);
						// 해당 객체의 병실
						ward = patient.getpRoom();

						System.out.printf("%s님의 현재 병실은 %d호실입니다.\n", pName, ward);
						System.out.printf("%s님이 이동할 병실 번호를 입력하세요.\n", pName);
						System.out.println("취소하려면 현재 병실을 입력하여 저장하거나 0을 입력하세요.");
						System.out.println();
						System.out.print("[이동할 병실]: ");
						movingWard = scan.nextInt();
						scan.nextLine();
						System.out.println("==========================================================");

						if (movingWard > 0 && movingWard < 500) {
							// 해당 객체의 병실 수정
							patient.setpRoom(movingWard);
							// 수정된 ArrayList 저장
							Data.save();

							if (movingWard == ward) {
								System.out.println("현재 병실을 유지합니다.");
							} else {
								System.out.println("병실 이동이 완료되었습니다.");
							}
							System.out.println("==========================================================");

						} else if (movingWard == 0) {
							System.out.println("병실 이동이 취소되었습니다.");
							System.out.println("==========================================================");

						} else {
							System.out.println("수용 가능한 코로나 환자의 병실은 1호실부터 500호실 입니다.");
							System.out.println("==========================================================");
						} // movingWard_if

					} else {
						System.out.println("입력한 정보와 일치하는 환자가 없습니다.");
						System.out.println("==========================================================");
					} // pNumber_if

				} else {
					System.out.println("입력 실패");
					System.out.println("==========================================================");
				} // isValid_if

			} else if (sel.equals("0")) {
				System.out.println();
				// outer 종료
				break move;

			} else {
				System.out.println("번호를 잘못 입력하였습니다.");
				System.out.println("==========================================================");
			} // sel_if

			Data.pause();
			String input = scan.nextLine();
			if (input.equals("0")) {
				flag = false;
			}

		} // while

	}// wardmove

}// WardMovement