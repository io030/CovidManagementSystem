package com.project.medicalstaff.doctor;

import java.util.Scanner;

import com.project.data.Data;
import com.project.data.DataService;
import com.project.patient.Patient;

/**
 * Leave 클래스입니다. 
 * 환자를 퇴원 처리합니다.
 * 
 * @author 2조
 * 
 */
public class Leave {

	/**
	 * 메소드입니다.
	 * 퇴원할 환자의 이름, 생년월일, 전화번호 뒷자리를 입력하면 환자 목록에서 일치하는 환자를 찾아 퇴원시킵니다.
	 * 퇴원시, 환자의 모든 정보가 영구 삭제됩니다.
	 */
	public static void leave() {

		boolean flag = true;
		int pNumber = 0;
		Scanner scan = new Scanner(System.in);

		// leave라는 이름을 가진 while문
		leave: while (flag) {
			System.out.println();
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃          퇴원 여부 관리           ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃    [0] 돌아가기   [1] 퇴원처리    ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

			System.out.print("번호를 입력하세요: ");
			String sel = scan.nextLine();

			if (sel.equals("1")) {
				System.out.println();
				System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
				System.out.println("┃             퇴원 처리             ┃");
				System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
				System.out.println();
				System.out.println();

				System.out.print("[퇴원할 환자의 이름]: ");
				String pName = scan.nextLine();
				System.out.println("======================================================================");

				System.out.print("[생년월일](6자리): ");
				String pBirth = scan.nextLine();
				System.out.println("======================================================================");

				System.out.print("[전화번호 뒷자리](4자리): ");
				String pTel = scan.nextLine();
				System.out.println("======================================================================");

				if (DataService.isValid(pName, pBirth, pTel)) {
					System.out.println("입력완료");
					System.out.println("======================================================================");

					// 전화번호, 생년월일, 전화번호가 일치하는 객체(환자)의 고유번호
					pNumber = DataService.getPatientNumber(pName, pBirth, pTel);

					if (pNumber > 0 && pNumber <= Data.patientList.size()) {
						// 해당 환자고유번호를 가진 객체
						Patient patient = DataService.getPatientNum1(pNumber);
						//2 3 2 14 13 12
						System.out.println("환자번호 이름 성별 생년월일 전화번호 주소");
						System.out.printf("%s, %s, %s, %s, %s, %s\n", patient.getpNumber(), patient.getpName(),
								patient.getpGender(), patient.getpJumin().subSequence(0,6), patient.getpTel(), patient.getpAddress());
						System.out.println("======================================================================");

						System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
						System.out.println("┃    [0] 취소하기   [1] 퇴원처리    ┃");
						System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
						System.out.println();
						System.out.print("퇴원처리: ");
						String cancle = scan.nextLine();
						System.out.println("======================================================================");

						if (cancle.equals("1")) {
							DataService.leaveRemove(patient);
							Data.save();
							System.out.println(pName + "님이 퇴원처리 되였습니다.");
							System.out
									.println("======================================================================");

						} else if (cancle.equals("0")) {
							System.out.println("취소되었습니다.");
							System.out
									.println("======================================================================");
						}

					} else {
						System.out.println("입력한 정보와 일치하는 환자가 없습니다.");
						System.out.println("======================================================================");
					}

				} else {
					System.out.println("입력 실패");
					System.out.println("======================================================================");
				} // isValid

			} else if (sel.equals("0")) {
				System.out.println();
				// outer 종료
				break leave;

			} else {
				System.out.println("번호를 잘못 입력하였습니다.");
				System.out.println("======================================================================");

			} // sel_if

			Data.pause();
			String input = scan.nextLine();
			if (input.equals("0")) {
				flag = false;
			}
		} // while

	}// leave

}// Leave
