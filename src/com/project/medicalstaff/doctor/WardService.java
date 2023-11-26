package com.project.medicalstaff.doctor;

import java.util.Scanner;

/**
 * WardService 클래스입니다. 
 * 환자 병실 관리 메뉴의 기능을 선택합니다. 
 * 
 * @author 2조
 * 
 */
public class WardService {
// 통일
	
	/**
	 * 메소드입니다.
	 * 환자 병실 관리 메뉴에서  돌아가기, 병실 이동, 퇴원 여부 관리 기능을 선택합니다.
	 */
	public static void wardService() {

		boolean flag = true;

		Scanner scan = new Scanner(System.in);

		System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("┃         환자 병실 관리            ┃");
		System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

		while (flag) {
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃         [0] 돌아가기              ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃         [1] 병실 이동             ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃         [2] 퇴원 여부 관리        ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

			System.out.print("번호를 입력하세요: ");
			String sel = scan.nextLine();

			if (sel.equals("1")) {

				// 병실이동
				WardMovement.wardmove();

			} else if (sel.equals("2")) {

				// 퇴원 여부 관리
				Leave.leave();

			} else if (sel.equals("0")) {

				flag = false;

			} else {

				System.out.println("번호를 잘못 입력하였습니다.");
				wardService();
			} // if

		} // while

		scan.close();
		
	}// wardService

}//WardService
