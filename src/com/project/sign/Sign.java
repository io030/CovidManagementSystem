package com.project.sign;

import java.util.Scanner;

/**
 * Sign클래스입니다. 환자 회원가입과 의료진 회원가입을 선택합니다.
 * @author 2조
 *
 */
public class Sign {
	
	/**
	 * 메소드입니다. 
	 * 회원가입 메뉴에서 돌아가기, 환자 회원가입, 의료진 회원가입 기능을 선택합니다.
	 */
	public static void begin() {
		
		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		
		while(flag) {
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃         [0] 돌아가기              ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓   ");
			System.out.println("┃         [1] 환자 회원 가입        ┃   ");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛   ");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓   ");
			System.out.println("┃         [2] 의료진 회원 가입      ┃   ");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛   ");
		
		System.out.print("번호를 입력하세요: ");
		String input = scan.nextLine();


		if (input.equals("1")) { // 환자 회원가입
			patientAgreement();
		} else if (input.equals("2")) { // 의료진 회원가입
			medicalStaffAgreement();
		} else if (input.equals("0")) {
			flag = false;
		}// if
		
	}// while
		
		scan.close();

}// begin
	private static void medicalStaffAgreement() {

		boolean flag = true;

		Scanner scan = new Scanner(System.in);

		while (flag) {

			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃                                            개인 정보 동의서                                                    ┃");
			System.out.println("┃ 1. 개인 정보 수집 및 이용 목적: 귀하의 소중한 개인정보를 진료서비스 목적으로 수집 및 이용합니다                ┃");
			System.out.println("┃    - 진료 및 입원 , 조회 등 진료 서비스 이용에 따른 본인 확인과 안내 절차에 사용                               ┃");
			System.out.println("┃    - 진료상담서비스 , 진단 및 치료 등을 위한 서비스                                                            ┃");
			System.out.println("┃    - 홍보 이용 제외                                                                                            ┃");
			System.out.println("┃ 2. 수집하려는 개인정보의 항목                                                                                  ┃");
			System.out.println("┃    - 성명 , 주민번호 , 나이 , 성별 , 전화번호 , 주소                                                           ┃");
			System.out.println("┃ 3. 동의 거부권 및 동의 거부시 불이익 안내                                                                      ┃");
			System.out.println("┃    - 수집 및 이용 동의 거부 시 진료신청이 불가능 할 수 있습니다                                                ┃");
			System.out.println("┃ 4. 제3자 제공                                                                                                  ┃");
			System.out.println("┃    - 의료법 제 21조 (기록 열람 등) 제 2항에 의거하여 개인 정보를 제3자에게 제공하는 경우                       ┃");
			System.out.println("┃    - 개인정보보호법 제 15조(개인정보의 수집 및 이용) 제 1항 제2호 , 제3호 및 제5호 등에 의해 제공하고 있습니다 ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃      [0] 동의     [1] 비동의      ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

			System.out.print("번호를 입력하세요: ");
			String input = scan.nextLine();


			if (input.equals("0")) { // 동의하기 == 의료진 회원가입
				MSSign.begin();
			} else if (input.equals("1")) { // 비동의 == 돌아가기
				flag = false;
			}// if

		}// while
		
		scan.close();
		
	}// medicalStaffAgreement
	public static void patientAgreement() { // 시작 메소드

		boolean flag = true;

		Scanner scan = new Scanner(System.in);

		while (flag) {

			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃                                            개인 정보 동의서                                                    ┃");
			System.out.println("┃ 1. 개인 정보 수집 및 이용 목적: 귀하의 소중한 개인정보를 진료서비스 목적으로 수집 및 이용합니다                ┃");
			System.out.println("┃    - 진료 및 입원 , 조회 등 진료 서비스 이용에 따른 본인 확인과 안내 절차에 사용                               ┃");
			System.out.println("┃    - 진료상담서비스 , 진단 및 치료 등을 위한 서비스                                                            ┃");
			System.out.println("┃    - 홍보 이용 제외                                                                                            ┃");
			System.out.println("┃ 2. 수집하려는 개인정보의 항목                                                                                  ┃");
			System.out.println("┃    - 성명 , 주민번호 , 나이 , 성별 , 전화번호 , 주소                                                           ┃");
			System.out.println("┃ 3. 동의 거부권 및 동의 거부시 불이익 안내                                                                      ┃");
			System.out.println("┃    - 수집 및 이용 동의 거부 시 진료신청이 불가능 할 수 있습니다                                                ┃");
			System.out.println("┃ 4. 제3자 제공                                                                                                  ┃");
			System.out.println("┃    - 의료법 제 21조 (기록 열람 등) 제 2항에 의거하여 개인 정보를 제3자에게 제공하는 경우                       ┃");
			System.out.println("┃    - 개인정보보호법 제 15조(개인정보의 수집 및 이용) 제 1항 제2호 , 제3호 및 제5호 등에 의해 제공하고 있습니다 ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃      [0] 동의     [1] 비동의      ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

			System.out.print("번호를 입력하세요: ");
			String input = scan.nextLine();


			if (input.equals("0")) { // 동의하기 == 환자 회원가입
				PSign.begin();
			} else if (input.equals("1")) { // 비동의 == 돌아가기
				flag = false;
			}// if

		}// while
		
		scan.close();

	}// patientAgreement
	
}// Sign
