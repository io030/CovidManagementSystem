package com.project.admin;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import com.project.MainClass;
import com.project.data.DataService;
import com.project.patient.Patient;

/**
 * ALogin 클래스입니다. 관리자 로그인입니다.
 * @author 2조
 *
 */
public class ALogin {
	
	/***
	 * 메소드입니다. 관리자 로그인 기능입니다.
	 */
	public static void begin() {
// 통일

		boolean flag = true;

		Scanner ip = new Scanner(System.in);

		while (flag) {

			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃           관리자 로그인           ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

			System.out.println("아이디와 비밀번호를 입력해 주세요!");

			System.out.print("아이디: ");
			String inputId = ip.nextLine();
			System.out.println("=====================================");
			System.out.print("비밀번호: ");
			String inputPw = ip.nextLine();
			System.out.println("=====================================");

			try {

				Scanner ipScan = new Scanner(new FileReader(".\\dat\\admin.txt"));

				int adminLogin = adminCheck(ipScan, inputId, inputPw);

				if (adminLogin == 1) {

					// 로그인 확인 후 메뉴 출력

					Admin.adminPage();

				} else if (adminLogin == 2) {

					// 틀릴 경우
					System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
					System.out.println("┃         잘못된 정보입니다         ┃");
					System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

					System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
					System.out.println("┃    [0] 돌아가기   [1] 다시하기    ┃");
					System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
					System.out.print("번호를 입력하세요: ");
					String input = ip.nextLine();

					if (input.equals("1")) {
						begin();
					} else if (input.equals("0")) {
						flag = false;
						// MainClass.main(null);
					}
				}

			} catch (Exception e) {
				System.out.println("Alogin.begin()");
				e.printStackTrace();
			}

		} // while

	}

	private static Integer adminCheck(Scanner ipScan, String inputId, String inputPw) {

		// 환자 한명씩을 String으로 저장한 직원리스트
		ArrayList<String> iplist = new ArrayList<String>();

		while (ipScan.hasNextLine()) {
			iplist.add(ipScan.nextLine());
		}

		// 환자 한명을 , 별로 쪼개서 patient 객체로 저장할 리스트

		ArrayList<AdminIP> adminIpArrayList = new ArrayList<AdminIP>();
		// adminIpList

		// 모든 정보를 한줄씩 받아 저장하도록 반복하는 반복문
		for (String list : iplist) {

			// admin.txt 에서 한줄로 받아온 어드민 정보를 ,로 쪼갬
			String[] adminIpListSplit = list.split(",");

			// 쪼갠 어드민 한명의 정보를 각각의 setter에 넣을 객체생성
			AdminIP adminIp = new AdminIP();

			// [2] == name , [4] == jumin

			adminIp.setAdminId(adminIpListSplit[0]);
			adminIp.setAdminPw(adminIpListSplit[1]);

			// patient.setBossPw(patientList[2]);

			// 쪼갠거를 adminIp 객체리스트에 저장
			adminIpArrayList.add(adminIp);

		}

		boolean pIdCheck = false;
		boolean pWCheck = false;

		for (AdminIP aip : adminIpArrayList) {

			if (aip.getAdminId().equals(inputId)) {
				pIdCheck = true;
			}

			if (aip.getAdminPw().equals(inputPw)) {
				pWCheck = true;
			}

		}

		if (pIdCheck && pWCheck) {
			return 1;

		} else {
			return 2;
		}

	}
}
