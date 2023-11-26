package com.project.medicalstaff;

import java.util.Scanner;

import com.project.medicalstaff.doctor.PatientService;
import com.project.medicalstaff.doctor.WardService;

/**
 * 
 * MedicalStaffPage 클래스입니다.
 * 의료진 페이지의 기능을 선택합니다.
 * @author 2조
 *
 */
public class MedicalStaffPage {
//통일
	/**
	 * 메소드입니다.
	 * 의료진 페이지에서 돌아가기, 환자 정보 조회, 환자 관리, 환자 병실 관리, 의료진 정보 관리 기능을 선택합니다,
	 * 
	 * @param snumber 의료진 면허번호
	 */
	public static void medicalStaffPage(String snumber) { // == 면허번호
		// 의료진 페이지

		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		// 환자 정보 조회
		// 환자 관리
		// 환자 병실 관리
		// 의료진 정보 조회 및 수정
		while (flag) {
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃         [0] 돌아가기              ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃         [1] 환자 정보 조회        ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃         [2] 환자 관리             ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃         [3] 환자 병실 관리        ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃         [4] 의료진 정보 관리      ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

			System.out.print("번호를 입력하세요: ");
			String input = scan.nextLine();

			if (input.equals("1")) {
				PatientInfo.patientInfo(); // 환자 정보 조회
			
			} else if (input.equals("2")) {
				PatientService.patientService(snumber); // 환자 관리
			
			} else if (input.equals("3")) { // 환자 병실 관리
				WardService.wardService();

			} else if (input.equals("4")) { // 의료진 정보 조회 및 수정
				MedicalStaffInfo.medicalStaffInfo(snumber);

			} else if (input.equals("0")) {
				flag = false; // 돌아가기
			} // if
		
		} // while

		scan.close();
		
	}//medicalStaffPage

}//MedicalStaffPage
