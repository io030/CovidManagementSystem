package com.project.medicalstaff;

import java.util.ArrayList;
import java.util.Scanner;

import com.project.data.Data;
import com.project.patient.Patient;

/**
 * PatientInfo 환자 정보 조회입니다.
 * @author 2조
 *
 */
public class PatientInfo {

	/***
	 * 메소드입니다. 환자의 정보를 조회하는 기능입니다.
	 */
	public static void patientInfo() {

		// 환자 정보 조회

//		고유번호: P0112
//		이름: 홍길동
//		나이: 30
//		생년월일: 970403
//		성별: 남
//		입원 날짜: 2022-09-20
//		병실: 201호
//		키: 176.3
//		몸무게: 65.9
//		전화번호: 010-1234-5678
//		백신 접종 유무(4개월 이내의 접종이력): 예
//		기저질환 이력: 배아픔
//		주소: 서울시 강남구 테헤란로 41번길
//		코로나 재감염여부: 아니오

		boolean flag = true;
		// Patient p = new Patient();
		Scanner scan = new Scanner(System.in);

		// ArrayList<Patient> list = new ArrayList<Patient>();

		while (flag) {

			System.out.print("이름을 입력해주세요: ");
			String name = scan.nextLine();
			System.out.println("========================================");
			System.out.print("생년월일을 입력해주세요: ");
			String jumin = scan.nextLine();
			System.out.println("========================================");

			System.out.print("전화 번호 뒷자리 4개를 입력해주세요:");
			String tel = scan.nextLine();
			System.out.println("========================================");

			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃           환자 정보 조회           ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println();

			for (Patient p : Data.patientList) {
				if (p.getpName().equals(name) && p.getpJumin().substring(0,6).equals(jumin)&& p.getpTel().substring(9, 13).equals(tel)) {
					System.out.printf("고유번호: %s\n", p.getpNumber());
					System.out.printf("이름: %s\n", p.getpName());
					System.out.printf("나이: %d\n", p.getpAge());
					System.out.printf("주민등록번호: %s\n", p.getpJumin());
					System.out.printf("성별: %s\n", p.getpGender());
					System.out.printf("입원날짜: %s\n", p.getpDate());
					System.out.printf("병실: %d\n", p.getpRoom());
					System.out.printf("키: %.1f\n", p.getpHeight());
					System.out.printf("몸무게: %.1f\n", p.getpWeight());
					System.out.printf("전화번호: %s\n", p.getpTel());
					System.out.printf("백신접종유무: %s\n", p.getpVaccine());
					System.out.printf("기저질환유무: %s\n", p.getpDisease());
					System.out.printf("주소: %s\n", p.getpAddress());
					System.out.printf("코로나 재감염 여부: %s\n", p.getpReinfection());
					System.out.println("========================================");
				}
			} // for

			Data.pause();
			String input = scan.nextLine();

			if (input.equals("0")) {

				flag = false; // 돌아가기
			} // if
		} // while

	}

//public static ArrayList<Patient> listScore(String pName, String pjumin, String ptel) {
//		
//		//student.txt(학년,반,번호) -> score.txt(성적)
//		
//		ArrayList<Patient> list = new ArrayList<Patient>();
//		
//		for (Patient p : Data.patientList) {
//			
//			if (p.getpName().equals(pName) && p.getpJumin().equals(pjumin) && p.getpTel().equals(ptel)) {
//				
//				
//				list.add(p);				
//			}
//			
//		}
//		
//		return list;		
//	}

}