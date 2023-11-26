package com.project.medicalstaff.doctor;

import java.util.Scanner;

import com.project.medicalstaff.PatientConditionView;


/**
 * PatientService 클래스입니다. 
 * 환자 관리 메뉴의 기능을 선택합니다.
 * 
 * @author 2조
 *
 */
public class PatientService {

	/**
	 * 메소드입니다.
	 * 로그인한 의료진의 면허번호를 받아 환자 관리 메뉴에서 돌아가기, 환자 상태 조회, EMR 조회 및 작성, 담당 환자 수정 기능을 선택합니다.
	 * 
	 * @param snumber 의료진 면허번호
	 */
	public static void patientService(String snumber) {
		// 환자 관리
		//통일
		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		// 환자 상태 조회
		// EMR 조회 및 작성
		// 담당 환자 수정
		while (flag) {
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃         [0] 돌아가기              ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃         [1] 환자 상태 조회        ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃         [2] EMR 조회 및 작성      ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃         [3] 담당 환자 수정        ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

			System.out.print("번호를 입력하세요: ");
			String input = scan.nextLine();

			if (input.equals("1")) {
				PatientConditionView.patientConditionView(); // 환자 상태 조회
			} else if (input.equals("2")) {
				EMRView.emrView(snumber); // EMR 조회
			} else if (input.equals("3")) {
				PatientModify.begin(); // 담당 환자 수정

			} else if (input.equals("0")) {

				flag = false; // 돌아가기
			} // if
			
		} // while
		
		scan.close();
		
	}//patientService

}//PetientSevice
